package com.mdsoft.configuration;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mdsoft.security.PlatformShiroRealm;

@Configuration
public class ShiroConfiguration {

	@Bean
	public EhCacheManager ehCacheManager() {
		EhCacheManager em = new EhCacheManager();
		em.setCacheManagerConfigFile("classpath:ehcache/ehcache-shiro.xml");
		return em;
	}

	@Bean
	public Realm realm() {
		PlatformShiroRealm realm = new PlatformShiroRealm();
		return realm;
	}

	@Bean
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
		dwsm.setRealm(realm());
		dwsm.setCacheManager(ehCacheManager());
		return dwsm;
	}

	@Bean
	public ShiroFilterChainDefinition shiroFilterChainDefinition() {
		DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
		Map<String, String> pathDefinitions = new LinkedHashMap<>(0);
		pathDefinitions.put("/login.html", "anon");
		pathDefinitions.put("/css/*", "anon");
		pathDefinitions.put("/js/*", "anon");
		pathDefinitions.put("/webjars/*", "anon");
		pathDefinitions.put("/images/*", "anon");
		pathDefinitions.put("/**", "authc");
		chainDefinition.addPathDefinitions(pathDefinitions);
		return chainDefinition;
	}
}

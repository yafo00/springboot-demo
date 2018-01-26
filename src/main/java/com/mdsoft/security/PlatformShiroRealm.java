package com.mdsoft.security;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.mdsoft.system.model.SysUserlogin;
import com.mdsoft.system.service.LoginService;

public class PlatformShiroRealm extends AuthorizingRealm {

	@Resource
	private LoginService loginService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		SysUserlogin userlogin = loginService.selectUserloginByUsername(upToken.getUsername());
		return new SimpleAuthenticationInfo(userlogin, upToken.getPassword(), getName());
	}

}

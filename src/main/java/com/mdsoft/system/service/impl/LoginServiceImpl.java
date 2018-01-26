package com.mdsoft.system.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mdsoft.system.mapper.SysUserloginMapper;
import com.mdsoft.system.model.SysUserlogin;
import com.mdsoft.system.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Resource
	private SysUserloginMapper sysUserloginMapper;
	
	@Override
	public SysUserlogin selectUserloginByUsername(String username) {
		
		return sysUserloginMapper.selectUserloginByUsername(username);
	}

}

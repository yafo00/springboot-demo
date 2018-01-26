package com.mdsoft.system.service;

import com.mdsoft.system.model.SysUserlogin;

public interface LoginService {

	SysUserlogin selectUserloginByUsername(String username);
}

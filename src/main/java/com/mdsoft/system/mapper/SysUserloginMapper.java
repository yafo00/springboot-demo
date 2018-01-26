package com.mdsoft.system.mapper;

import com.mdsoft.system.model.SysUserlogin;
import tk.mybatis.mapper.common.Mapper;

public interface SysUserloginMapper extends Mapper<SysUserlogin> {

	SysUserlogin selectUserloginByUsername(String username);
}
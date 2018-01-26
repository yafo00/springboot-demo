package com.mdsoft.system.model;

import javax.persistence.*;

@Table(name = "sys_role_perm")
public class SysRolePerm {
    /**
     * 角色ID
     */
    @Id
    private String roleid;

    /**
     * 功能ID
     */
    @Id
    private String permissionid;

    /**
     * 获取角色ID
     *
     * @return roleid - 角色ID
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * 设置角色ID
     *
     * @param roleid 角色ID
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取功能ID
     *
     * @return permissionid - 功能ID
     */
    public String getPermissionid() {
        return permissionid;
    }

    /**
     * 设置功能ID
     *
     * @param permissionid 功能ID
     */
    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid;
    }
}
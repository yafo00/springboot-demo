package com.mdsoft.system.model;

import javax.persistence.*;

@Table(name = "sys_role_menu")
public class SysRoleMenu {
    /**
     * 角色ID
     */
    @Id
    private String roleid;

    /**
     * 菜单ID
     */
    @Id
    private String menuid;

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
     * 获取菜单ID
     *
     * @return menuid - 菜单ID
     */
    public String getMenuid() {
        return menuid;
    }

    /**
     * 设置菜单ID
     *
     * @param menuid 菜单ID
     */
    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }
}
package com.mdsoft.system.model;

import javax.persistence.*;

@Table(name = "sys_role_depart")
public class SysRoleDepart {
    /**
     * 角色ID
     */
    @Id
    private String roleid;

    /**
     * 部门ID
     */
    @Id
    private String departid;

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
     * 获取部门ID
     *
     * @return departid - 部门ID
     */
    public String getDepartid() {
        return departid;
    }

    /**
     * 设置部门ID
     *
     * @param departid 部门ID
     */
    public void setDepartid(String departid) {
        this.departid = departid;
    }
}
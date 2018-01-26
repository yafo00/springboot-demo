package com.mdsoft.system.model;

import javax.persistence.*;

@Table(name = "sys_role_person")
public class SysRolePerson {
    /**
     * 角色ID
     */
    @Id
    private String roleid;

    /**
     * 人员ID
     */
    @Id
    private String personid;

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
     * 获取人员ID
     *
     * @return personid - 人员ID
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * 设置人员ID
     *
     * @param personid 人员ID
     */
    public void setPersonid(String personid) {
        this.personid = personid;
    }
}
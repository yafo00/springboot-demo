package com.mdsoft.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu {
    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 菜单名称
     */
    private String menuname;

    /**
     * 菜单路径
     */
    private String menuurl;

    /**
     * 上级菜单ID
     */
    private String parentid;

    /**
     * 菜单图标
     */
    private String menuicon;

    /**
     * 是否打开：0-否，1-是
     */
    private Integer isopened;

    /**
     * 菜单说明
     */
    private String remark;

    /**
     * 排序号
     */
    private Integer sortnumber;

    /**
     * 添加人
     */
    private String addperson;

    /**
     * 添加人ID
     */
    private String addpartyid;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 编辑人
     */
    private String editperson;

    /**
     * 编辑人ID
     */
    private String editpartyid;

    /**
     * 编辑时间
     */
    private Date edittime;

    /**
     * 删除状态：0-未删除，1-已删除
     */
    private Integer isdeleted;

    /**
     * 删除人
     */
    private String delperson;

    /**
     * 删除人ID
     */
    private String delpartyid;

    /**
     * 删除时间
     */
    private Date deltime;

    /**
     * 删除原因
     */
    private String delreason;

    /**
     * 扩展字段1（字符串类型）
     */
    private String extattrone;

    /**
     * 扩展字段2（字符串类型）
     */
    private String extattrtwo;

    /**
     * 扩展字段3（字符串类型）
     */
    private String extattrthree;

    /**
     * 扩展字段4（数字类型）
     */
    private Integer extattrfour;

    /**
     * 扩展字段5（数字类型）
     */
    private Integer extattrfive;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取菜单名称
     *
     * @return menuname - 菜单名称
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * 设置菜单名称
     *
     * @param menuname 菜单名称
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    /**
     * 获取菜单路径
     *
     * @return menuurl - 菜单路径
     */
    public String getMenuurl() {
        return menuurl;
    }

    /**
     * 设置菜单路径
     *
     * @param menuurl 菜单路径
     */
    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    /**
     * 获取上级菜单ID
     *
     * @return parentid - 上级菜单ID
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * 设置上级菜单ID
     *
     * @param parentid 上级菜单ID
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取菜单图标
     *
     * @return menuicon - 菜单图标
     */
    public String getMenuicon() {
        return menuicon;
    }

    /**
     * 设置菜单图标
     *
     * @param menuicon 菜单图标
     */
    public void setMenuicon(String menuicon) {
        this.menuicon = menuicon;
    }

    /**
     * 获取是否打开：0-否，1-是
     *
     * @return isopened - 是否打开：0-否，1-是
     */
    public Integer getIsopened() {
        return isopened;
    }

    /**
     * 设置是否打开：0-否，1-是
     *
     * @param isopened 是否打开：0-否，1-是
     */
    public void setIsopened(Integer isopened) {
        this.isopened = isopened;
    }

    /**
     * 获取菜单说明
     *
     * @return remark - 菜单说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置菜单说明
     *
     * @param remark 菜单说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取排序号
     *
     * @return sortnumber - 排序号
     */
    public Integer getSortnumber() {
        return sortnumber;
    }

    /**
     * 设置排序号
     *
     * @param sortnumber 排序号
     */
    public void setSortnumber(Integer sortnumber) {
        this.sortnumber = sortnumber;
    }

    /**
     * 获取添加人
     *
     * @return addperson - 添加人
     */
    public String getAddperson() {
        return addperson;
    }

    /**
     * 设置添加人
     *
     * @param addperson 添加人
     */
    public void setAddperson(String addperson) {
        this.addperson = addperson;
    }

    /**
     * 获取添加人ID
     *
     * @return addpartyid - 添加人ID
     */
    public String getAddpartyid() {
        return addpartyid;
    }

    /**
     * 设置添加人ID
     *
     * @param addpartyid 添加人ID
     */
    public void setAddpartyid(String addpartyid) {
        this.addpartyid = addpartyid;
    }

    /**
     * 获取添加时间
     *
     * @return addtime - 添加时间
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * 设置添加时间
     *
     * @param addtime 添加时间
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * 获取编辑人
     *
     * @return editperson - 编辑人
     */
    public String getEditperson() {
        return editperson;
    }

    /**
     * 设置编辑人
     *
     * @param editperson 编辑人
     */
    public void setEditperson(String editperson) {
        this.editperson = editperson;
    }

    /**
     * 获取编辑人ID
     *
     * @return editpartyid - 编辑人ID
     */
    public String getEditpartyid() {
        return editpartyid;
    }

    /**
     * 设置编辑人ID
     *
     * @param editpartyid 编辑人ID
     */
    public void setEditpartyid(String editpartyid) {
        this.editpartyid = editpartyid;
    }

    /**
     * 获取编辑时间
     *
     * @return edittime - 编辑时间
     */
    public Date getEdittime() {
        return edittime;
    }

    /**
     * 设置编辑时间
     *
     * @param edittime 编辑时间
     */
    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    /**
     * 获取删除状态：0-未删除，1-已删除
     *
     * @return isdeleted - 删除状态：0-未删除，1-已删除
     */
    public Integer getIsdeleted() {
        return isdeleted;
    }

    /**
     * 设置删除状态：0-未删除，1-已删除
     *
     * @param isdeleted 删除状态：0-未删除，1-已删除
     */
    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    /**
     * 获取删除人
     *
     * @return delperson - 删除人
     */
    public String getDelperson() {
        return delperson;
    }

    /**
     * 设置删除人
     *
     * @param delperson 删除人
     */
    public void setDelperson(String delperson) {
        this.delperson = delperson;
    }

    /**
     * 获取删除人ID
     *
     * @return delpartyid - 删除人ID
     */
    public String getDelpartyid() {
        return delpartyid;
    }

    /**
     * 设置删除人ID
     *
     * @param delpartyid 删除人ID
     */
    public void setDelpartyid(String delpartyid) {
        this.delpartyid = delpartyid;
    }

    /**
     * 获取删除时间
     *
     * @return deltime - 删除时间
     */
    public Date getDeltime() {
        return deltime;
    }

    /**
     * 设置删除时间
     *
     * @param deltime 删除时间
     */
    public void setDeltime(Date deltime) {
        this.deltime = deltime;
    }

    /**
     * 获取删除原因
     *
     * @return delreason - 删除原因
     */
    public String getDelreason() {
        return delreason;
    }

    /**
     * 设置删除原因
     *
     * @param delreason 删除原因
     */
    public void setDelreason(String delreason) {
        this.delreason = delreason;
    }

    /**
     * 获取扩展字段1（字符串类型）
     *
     * @return extattrone - 扩展字段1（字符串类型）
     */
    public String getExtattrone() {
        return extattrone;
    }

    /**
     * 设置扩展字段1（字符串类型）
     *
     * @param extattrone 扩展字段1（字符串类型）
     */
    public void setExtattrone(String extattrone) {
        this.extattrone = extattrone;
    }

    /**
     * 获取扩展字段2（字符串类型）
     *
     * @return extattrtwo - 扩展字段2（字符串类型）
     */
    public String getExtattrtwo() {
        return extattrtwo;
    }

    /**
     * 设置扩展字段2（字符串类型）
     *
     * @param extattrtwo 扩展字段2（字符串类型）
     */
    public void setExtattrtwo(String extattrtwo) {
        this.extattrtwo = extattrtwo;
    }

    /**
     * 获取扩展字段3（字符串类型）
     *
     * @return extattrthree - 扩展字段3（字符串类型）
     */
    public String getExtattrthree() {
        return extattrthree;
    }

    /**
     * 设置扩展字段3（字符串类型）
     *
     * @param extattrthree 扩展字段3（字符串类型）
     */
    public void setExtattrthree(String extattrthree) {
        this.extattrthree = extattrthree;
    }

    /**
     * 获取扩展字段4（数字类型）
     *
     * @return extattrfour - 扩展字段4（数字类型）
     */
    public Integer getExtattrfour() {
        return extattrfour;
    }

    /**
     * 设置扩展字段4（数字类型）
     *
     * @param extattrfour 扩展字段4（数字类型）
     */
    public void setExtattrfour(Integer extattrfour) {
        this.extattrfour = extattrfour;
    }

    /**
     * 获取扩展字段5（数字类型）
     *
     * @return extattrfive - 扩展字段5（数字类型）
     */
    public Integer getExtattrfive() {
        return extattrfive;
    }

    /**
     * 设置扩展字段5（数字类型）
     *
     * @param extattrfive 扩展字段5（数字类型）
     */
    public void setExtattrfive(Integer extattrfive) {
        this.extattrfive = extattrfive;
    }
}
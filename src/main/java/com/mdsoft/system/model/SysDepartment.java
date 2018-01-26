package com.mdsoft.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_department")
public class SysDepartment {
    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 组织名称
     */
    private String departname;

    /**
     * 组织简称
     */
    private String sortname;

    /**
     * 组织编号
     */
    private String departnum;

    /**
     * 上级组织ID
     */
    private String parentid;

    /**
     * 排序号
     */
    private Integer sortnumber;

    /**
     * 工作地点
     */
    private String address;

    /**
     * 邮政编码
     */
    private String postcode;

    /**
     * 固定电话
     */
    private String telephone;

    /**
     * 传真
     */
    private String fax;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 组织领导ID
     */
    private String leaderid;

    /**
     * 备注
     */
    private String remark;

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
     * 获取组织名称
     *
     * @return departname - 组织名称
     */
    public String getDepartname() {
        return departname;
    }

    /**
     * 设置组织名称
     *
     * @param departname 组织名称
     */
    public void setDepartname(String departname) {
        this.departname = departname;
    }

    /**
     * 获取组织简称
     *
     * @return sortname - 组织简称
     */
    public String getSortname() {
        return sortname;
    }

    /**
     * 设置组织简称
     *
     * @param sortname 组织简称
     */
    public void setSortname(String sortname) {
        this.sortname = sortname;
    }

    /**
     * 获取组织编号
     *
     * @return departnum - 组织编号
     */
    public String getDepartnum() {
        return departnum;
    }

    /**
     * 设置组织编号
     *
     * @param departnum 组织编号
     */
    public void setDepartnum(String departnum) {
        this.departnum = departnum;
    }

    /**
     * 获取上级组织ID
     *
     * @return parentid - 上级组织ID
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * 设置上级组织ID
     *
     * @param parentid 上级组织ID
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
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
     * 获取工作地点
     *
     * @return address - 工作地点
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置工作地点
     *
     * @param address 工作地点
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取邮政编码
     *
     * @return postcode - 邮政编码
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮政编码
     *
     * @param postcode 邮政编码
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取固定电话
     *
     * @return telephone - 固定电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置固定电话
     *
     * @param telephone 固定电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取传真
     *
     * @return fax - 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置传真
     *
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取组织领导ID
     *
     * @return leaderid - 组织领导ID
     */
    public String getLeaderid() {
        return leaderid;
    }

    /**
     * 设置组织领导ID
     *
     * @param leaderid 组织领导ID
     */
    public void setLeaderid(String leaderid) {
        this.leaderid = leaderid;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
package com.mdsoft.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_dictionary_data")
public class SysDictionaryData {
    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 显示名称
     */
    private String dicname;

    /**
     * 编码
     */
    private String dicvalue;

    /**
     * 排序号
     */
    private Integer sortnumber;

    /**
     * 描述
     */
    private String remark;

    /**
     * 字典类别ID
     */
    private String parentid;

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
     * 获取显示名称
     *
     * @return dicname - 显示名称
     */
    public String getDicname() {
        return dicname;
    }

    /**
     * 设置显示名称
     *
     * @param dicname 显示名称
     */
    public void setDicname(String dicname) {
        this.dicname = dicname;
    }

    /**
     * 获取编码
     *
     * @return dicvalue - 编码
     */
    public String getDicvalue() {
        return dicvalue;
    }

    /**
     * 设置编码
     *
     * @param dicvalue 编码
     */
    public void setDicvalue(String dicvalue) {
        this.dicvalue = dicvalue;
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
     * 获取描述
     *
     * @return remark - 描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置描述
     *
     * @param remark 描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取字典类别ID
     *
     * @return parentid - 字典类别ID
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * 设置字典类别ID
     *
     * @param parentid 字典类别ID
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
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
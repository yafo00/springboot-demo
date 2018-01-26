package com.mdsoft.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_person")
public class SysPerson {
    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 姓名
     */
    private String truename;

    /**
     * 姓名拼音
     */
    private String pinyin;

    /**
     * 性别：0-女，1-男
     */
    private Integer gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 学历
     */
    private String degree;

    /**
     * 身份证号
     */
    private String idcardnumber;

    /**
     * 手机号码
     */
    private String phonenumber;

    /**
     * 固定电话
     */
    private String telephone;

    /**
     * QQ
     */
    private String qq;

    /**
     * 微信
     */
    private String weixin;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 地址
     */
    private String address;

    /**
     * 职务
     */
    private String post;

    /**
     * 工号
     */
    private String jobnumber;

    /**
     * 排序号
     */
    private Integer sortnumber;

    /**
     * 人员状态：0-正常，1-离职
     */
    private Integer status;

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
     * 获取姓名
     *
     * @return truename - 姓名
     */
    public String getTruename() {
        return truename;
    }

    /**
     * 设置姓名
     *
     * @param truename 姓名
     */
    public void setTruename(String truename) {
        this.truename = truename;
    }

    /**
     * 获取姓名拼音
     *
     * @return pinyin - 姓名拼音
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * 设置姓名拼音
     *
     * @param pinyin 姓名拼音
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    /**
     * 获取性别：0-女，1-男
     *
     * @return gender - 性别：0-女，1-男
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别：0-女，1-男
     *
     * @param gender 性别：0-女，1-男
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取学历
     *
     * @return degree - 学历
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置学历
     *
     * @param degree 学历
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * 获取身份证号
     *
     * @return idcardnumber - 身份证号
     */
    public String getIdcardnumber() {
        return idcardnumber;
    }

    /**
     * 设置身份证号
     *
     * @param idcardnumber 身份证号
     */
    public void setIdcardnumber(String idcardnumber) {
        this.idcardnumber = idcardnumber;
    }

    /**
     * 获取手机号码
     *
     * @return phonenumber - 手机号码
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置手机号码
     *
     * @param phonenumber 手机号码
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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
     * 获取QQ
     *
     * @return qq - QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ
     *
     * @param qq QQ
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取微信
     *
     * @return weixin - 微信
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * 设置微信
     *
     * @param weixin 微信
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin;
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
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取职务
     *
     * @return post - 职务
     */
    public String getPost() {
        return post;
    }

    /**
     * 设置职务
     *
     * @param post 职务
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * 获取工号
     *
     * @return jobnumber - 工号
     */
    public String getJobnumber() {
        return jobnumber;
    }

    /**
     * 设置工号
     *
     * @param jobnumber 工号
     */
    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
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
     * 获取人员状态：0-正常，1-离职
     *
     * @return status - 人员状态：0-正常，1-离职
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置人员状态：0-正常，1-离职
     *
     * @param status 人员状态：0-正常，1-离职
     */
    public void setStatus(Integer status) {
        this.status = status;
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
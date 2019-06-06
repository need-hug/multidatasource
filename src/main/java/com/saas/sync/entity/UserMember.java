package com.saas.sync.entity;

import java.io.Serializable;
import java.util.Date;

public class UserMember implements Serializable {
    /**
     * 会员id
     */
    private String memberId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 性别 0女 1男
     */
    private Byte sex;
    /**
     * 手机号
     */
    private String phone;
    /**
     * openid
     */
    private String openid;
    /**
     * 芯片码
     */
    private String shipCode;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 身份证
     */
    private String idNumber;
    /**
     * 注册来源id
     */
    private  Long sourceId;
    /**
     * 进场积分
     */
    private Integer entryIntegral;
    /**
     * 购物积分
     */
    private Integer shopIntegral;
    /**
     * 推荐积分
     */
    private Integer recommendIntegral;
    /**
     * 活动积分
     */
    private Integer activityIntegral;
    /**
     * 总积分
     */
    private Integer totalIntegral;
    /**
     * 删除标识 0删除 1未删除
     */
    private Byte isDel;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;


    private static final long serialVersionUID = 1L;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode == null ? null : shipCode.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }


    public Integer getEntryIntegral() {
        return entryIntegral;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setEntryIntegral(Integer entryIntegral) {
        this.entryIntegral = entryIntegral;
    }

    public Integer getShopIntegral() {
        return shopIntegral;
    }

    public void setShopIntegral(Integer shopIntegral) {
        this.shopIntegral = shopIntegral;
    }

    public Integer getRecommendIntegral() {
        return recommendIntegral;
    }

    public void setRecommendIntegral(Integer recommendIntegral) {
        this.recommendIntegral = recommendIntegral;
    }

    public Integer getActivityIntegral() {
        return activityIntegral;
    }

    public void setActivityIntegral(Integer activityIntegral) {
        this.activityIntegral = activityIntegral;
    }

    public Integer getTotalIntegral() {
        return totalIntegral;
    }

    public void setTotalIntegral(Integer totalIntegral) {
        this.totalIntegral = totalIntegral;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }
}
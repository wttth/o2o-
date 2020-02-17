package com.imooc.o2o.entity;
import java.util.Date;

//用户信息
public class PersonInfo {
    // Primary Key
    private Long userId;

    private String name;

    private String profileImg;

    private String email;

    private String gender;
    // status: 0.disabled 1.available
    private Integer enableStatus;
    //type: 1.Customer 2.Store 3.Super administrator
    private Integer userType;

    private Date createTime;

    private Date lastEditTime;

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProfileImg() {
        return profileImg;
    }
    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Integer getEnableStatus() {
        return enableStatus;
    }
    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }
    public Integer getUserType() {
        return userType;
    }
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getLastEditTime() {
        return lastEditTime;
    }
    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}

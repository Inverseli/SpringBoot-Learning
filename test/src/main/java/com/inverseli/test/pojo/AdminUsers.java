package com.inverseli.test.pojo;

import java.util.Date;

public class AdminUsers {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userEmail;

    private String userMobile;

    private String userOpenid;

    private Date userRegistertime;

    private String userRegisterip;

    private Date userLastlogintime;

    private String userLastloginip;

    private Integer userStatus;

    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid == null ? null : userOpenid.trim();
    }

    public Date getUserRegistertime() {
        return userRegistertime;
    }

    public void setUserRegistertime(Date userRegistertime) {
        this.userRegistertime = userRegistertime;
    }

    public String getUserRegisterip() {
        return userRegisterip;
    }

    public void setUserRegisterip(String userRegisterip) {
        this.userRegisterip = userRegisterip == null ? null : userRegisterip.trim();
    }

    public Date getUserLastlogintime() {
        return userLastlogintime;
    }

    public void setUserLastlogintime(Date userLastlogintime) {
        this.userLastlogintime = userLastlogintime;
    }

    public String getUserLastloginip() {
        return userLastloginip;
    }

    public void setUserLastloginip(String userLastloginip) {
        this.userLastloginip = userLastloginip == null ? null : userLastloginip.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
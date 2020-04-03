package com.example.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName("user")
public class User {
    @TableId(type = IdType.ID_WORKER)
    private long userId;
    @TableField
    private String account;
    @TableField
    private String password;
    @TableField
    private String salt;
    @TableField
    private String name;
//    @TableField
//    private java.sql.Timestamp birthday;
    @TableField
    private String sex;
    @TableField
    private String email;
    @TableField
    private String phone;
    @TableField
    private String roleId;

//    @TableField
//    private java.sql.Timestamp createTime;
//
//    @TableField
//    private java.sql.Timestamp updateTime;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//
//    public java.sql.Timestamp getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(java.sql.Timestamp birthday) {
//        this.birthday = birthday;
//    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }



//
//    public java.sql.Timestamp getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(java.sql.Timestamp createTime) {
//        this.createTime = createTime;
//    }
//
//
//
//
//
//    public java.sql.Timestamp getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(java.sql.Timestamp updateTime) {
//        this.updateTime = updateTime;
//    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", name='" + name + '\'' +
//                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", roleId='" + roleId + '\'' +
//                ", createTime=" + createTime +
//                ", updateTime=" + updateTime +


                '}';
    }





}

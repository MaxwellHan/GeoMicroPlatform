package com.GeoMicroPlatform.Models;

import java.io.Serializable;

public class User implements Serializable {
    private String id;          //唯一的标识
    private String password;
    private String privilege;    //用户权限，超级管理员可以查看用户的所有信息，并且修改用户的密码
    private String name;
    private String gender;
    private String birthday;     //例如2004-04-07
    private String classnumber;  //比如2018级2班
    private String status;       //状态，比如在读，请假，毕业等，具体含义可能会变

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", privilege='" + privilege + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", classnumber='" + classnumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

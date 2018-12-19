package xyz.yescn.blog.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {
    /**
     * 用户Id
     */
    private Long id;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户描述
     */
    private String userDesc;
    /**
     * 用户后台登录密码
     */
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 用户手机
     */
    private String phone;
    /**
     * 用户创建时间
     */
    private Timestamp createTime;
    /**
     * 用户更新时间
     */
    private Timestamp updateTime;
    /**
     * 用户头像
     */
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}

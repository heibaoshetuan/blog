package xyz.yescn.blog.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class User implements Serializable {
    /**
     * 用户Id
     */
    private Long id;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户描述
     */
    private String description;
    /**
     * 用户后台登录密码
     */
    private String password;
    /**
     * 第三方关联登录授权令牌，例如通过微信或支付宝登录的用户
     */
    private String token;
    /**
     * 用户手机
     */
    private String phone;
    /**
     * 用户创建时间
     */
    private String createTime;
    /**
     * 用户更新时间
     */
    private String updateTime;
    /**
     * 用户头像
     */
    private String imageUrl;
    /**
     * 用户状态是否可以用，1为可用，0位禁止使用
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", status=" + status +
                '}';
    }
}

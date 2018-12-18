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
    private String name;
    /**
     * 用户描述
     */
    private String desc;
    /**
     * 用户后台登录密码
     */
    private String password;
    /**
     * 用户第三方登录令牌toKey
     */
    private String toKey;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToKey() {
        return toKey;
    }

    public void setToKey(String toKey) {
        this.toKey = toKey;
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

    public User(Long id, String name, String desc, String phone) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.phone = phone;
    }
}

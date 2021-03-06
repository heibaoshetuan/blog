package xyz.yescn.blog.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author issuser
 */
public class Picture implements Serializable {
    /**
     * 相片ID
     */
    private Long id;
    /**
     * 相片服务器地址
     */
    private String url;
    /**
     * 相片描述
     */
    private String description;
    /**
     * 相片上传时间
     */
    private String createTime;
    /**
     * 日志信息表，用于关联日志上传图片
     */
    private Daily daily;

    private Long dailyId;

    public Long getDailyId() {
        return dailyId;
    }

    public void setDailyId(Long dailyId) {
        this.dailyId = dailyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                ", daily=" + daily +
                ", dailyId=" + dailyId +
                '}';
    }
}

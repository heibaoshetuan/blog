package xyz.yescn.blog.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author gavin_wang
 */
public class Daily implements Serializable {
    /**
     * 日志ID
     */
    private Long id;
    /**
     * 日志标题
     */
    private String title;
    /**
     * 日志内容
     */
    private String content;
    /**
     * 日志创建时间
     */
    private String createTime;
    /**
     * 日志更新时间
     */
    private String updateTime;
    /**
     * 日志标题图片，当没有上传标题图片时，默认使用日志中第一张图片，或用户头像
     */
    private String headerImageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", headerImageUrl='" + headerImageUrl + '\'' +
                '}';
    }
}

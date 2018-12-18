package xyz.yescn.blog.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author issuser
 * 游客或访问评论信息对象
 */
public class Comment implements Serializable {
    /**
     * 评论主键Id
     */
    private Long id;
    /**
     * 日志Id
     */
    private Long dailyId;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论时间
     */
    private Timestamp createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDailyId() {
        return dailyId;
    }

    public void setDailyId(Long dailyId) {
        this.dailyId = dailyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}

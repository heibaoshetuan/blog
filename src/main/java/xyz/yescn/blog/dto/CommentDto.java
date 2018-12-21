package xyz.yescn.blog.dto;

import xyz.yescn.blog.domain.Daily;

/**
 * @author issuser
 */
public class CommentDto {
    /**
     * 评论主键Id
     */
    private Long id;
    /**
     * 评论内容父ID
     */
    private Long pid;
    /**
     * 日志信息，用于关联评论内容
     */
    private Daily daily;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论时间
     */
    private String createTime;
    /**
     * 日志主键ID
     */
    private Long dailyId;
    /**
     * 评论人Id
     */
    private Long urId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
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

    public Long getDailyId() {
        return dailyId;
    }

    public void setDailyId(Long dailyId) {
        this.dailyId = dailyId;
    }

    public Long getUrId() {
        return urId;
    }

    public void setUrId(Long urId) {
        this.urId = urId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", pid=" + pid +
                ", daily=" + daily +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                ", dailyId=" + dailyId +
                ", urId=" + urId +
                '}';
    }
}

package xyz.yescn.blog.dto;

/**
 * @author issuser
 */
public class CommentDto {
    /**
     * 评论主键Id
     */
    private Long id;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论时间
     */
    private String createTime;
    /**
     * 日志id
     */
    private Long dailyId;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

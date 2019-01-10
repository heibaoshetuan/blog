package xyz.yescn.blog.domain;

import xyz.yescn.blog.dto.CommentDto;
import xyz.yescn.blog.dto.PictureDto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

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
    private Timestamp createTime;
    /**
     * 日志更新时间
     */
    private String updateTime;
    /**
     * 日志分类
     */
    private Category category;
    /**
     * 日志标签，用户搜索和热门日志推荐
     */
    private String tag;
    /**
     * 日志分类Id
     */
    private Long cgId;
    /**
     * 用户id
     */
    private Long urId;

    /**
     * 日志评论内容
     */
    private List<Comment> commentList;
    /**
     * 日志上传图片
     */
    private List<Picture> pictureList;


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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public Long getCgId() {
        return cgId;
    }

    public void setCgId(Long cgId) {
        this.cgId = cgId;
    }

    public Long getUrId() {
        return urId;
    }

    public void setUrId(Long urId) {
        this.urId = urId;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", category=" + category +
                ", tag='" + tag + '\'' +
                ", cgId=" + cgId +
                ", urId=" + urId +
                ", commentList=" + commentList +
                ", pictureList=" + pictureList +
                '}';
    }
}

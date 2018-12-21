package xyz.yescn.blog.dto;

import xyz.yescn.blog.domain.Category;

import java.util.List;

/**
 * @author issuser
 */
public class DailyDto {
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
     * 日志分类
     */
    private Category category;
    /**
     * 日志标签，用户搜索和热门日志推荐
     */
    private String tag;
    /**
     * 日志评论内容
     */
    private List<CommentDto> commentDtoList;
    /**
     * 日志上传图片
     */
    private List<PictureDto> pictureDtoList;


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

    public List<CommentDto> getCommentDtoList() {
        return commentDtoList;
    }

    public void setCommentDtoList(List<CommentDto> commentDtoList) {
        this.commentDtoList = commentDtoList;
    }

    public List<PictureDto> getPictureDtoList() {
        return pictureDtoList;
    }

    public void setPictureDtoList(List<PictureDto> pictureDtoList) {
        this.pictureDtoList = pictureDtoList;
    }

    @Override
    public String toString() {
        return "DailyDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", category=" + category +
                ", tag='" + tag + '\'' +
                ", commentDtoList=" + commentDtoList +
                ", pictureDtoList=" + pictureDtoList +
                '}';
    }
}

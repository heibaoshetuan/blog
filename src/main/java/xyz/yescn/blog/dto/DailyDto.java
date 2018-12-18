package xyz.yescn.blog.dto;

import java.util.List;

/**
 * @author issuser
 */
public class DailyDto {
    private Long id;
    private String title;
    private String content;
    private String createTime;
    private List<PictureDto> pictureDtoList;
    private List<CommentDto> commentDtoList;

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

    public List<PictureDto> getPictureDtoList() {
        return pictureDtoList;
    }

    public void setPictureDtoList(List<PictureDto> pictureDtoList) {
        this.pictureDtoList = pictureDtoList;
    }

    public List<CommentDto> getCommentDtoList() {
        return commentDtoList;
    }

    public void setCommentDtoList(List<CommentDto> commentDtoList) {
        this.commentDtoList = commentDtoList;
    }
}

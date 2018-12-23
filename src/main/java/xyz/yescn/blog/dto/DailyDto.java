package xyz.yescn.blog.dto;

import lombok.Getter;
import lombok.Setter;
import xyz.yescn.blog.domain.Category;

import java.util.List;

/**
 * @author issuser
 */
@Getter
@Setter
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
    /**
     * 日志分类
     */
    private Long cgId;
    /**
     *
     */
    private Long urId;

}

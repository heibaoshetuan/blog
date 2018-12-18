package xyz.yescn.blog.dao;

import org.springframework.stereotype.Repository;
import xyz.yescn.blog.domain.Comment;
import xyz.yescn.blog.dto.CommentDto;
import xyz.yescn.blog.dto.DailyDto;

import java.util.List;

/**
 * @author issuser
 */
@Repository
public interface CommentMapper {
    /**
     * 通过评论Id查询评论内容
     * @param id
     * @return
     */
    Comment getCommentById(Long id);

    /**
     * 添加评论内容
     * @param commentDto
     */
    void insertComment(CommentDto commentDto);

    /**
     * 更新评论内容
     * @param commentDto
     */
    void updateComment(CommentDto commentDto);

    /**
     * 通过评论ID，删除评论内容
     * @param id
     */
    void deleteComment(Long id);

    /**
     * @param dailyId 日志ID
     * 通过日志ID
     * 查询对应的结合评论内容
     * @return List<Comment>
     */
    List<Comment> getCommentList(Long dailyId);
}

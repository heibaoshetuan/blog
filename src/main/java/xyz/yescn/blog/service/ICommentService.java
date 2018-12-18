package xyz.yescn.blog.service;

import xyz.yescn.blog.dto.CommentDto;

import java.util.List;

/**
 * @author issuser
 */
public interface ICommentService {
    /**
     * 通过评论Id查询评论内容
     * @param id
     * @return
     */
    CommentDto getCommentById(Long id);

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
     * 通过日志ID，查询对应的评论内容
     * @return
     */
    List<CommentDto> getCommentDtoList(Long dailyId);
}

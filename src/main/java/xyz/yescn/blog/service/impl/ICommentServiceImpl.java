package xyz.yescn.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.yescn.blog.dao.CommentMapper;
import xyz.yescn.blog.domain.Comment;
import xyz.yescn.blog.dto.CommentDto;
import xyz.yescn.blog.exception.CustomException;
import xyz.yescn.blog.msg.CustomErrorMsg;
import xyz.yescn.blog.service.ICommentService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author issuser
 */
@Service("commentService")
public class ICommentServiceImpl implements ICommentService {
    /**
     * 评论内容dao持久化层接口
     */
    @Autowired
    private CommentMapper commentMapper;

    /**
     * 通过评论Id查询评论内容
     *
     * @param id
     * @return
     */
    @Override
    public CommentDto getCommentById(Long id) {
        return getCommentDtoFromComment(commentMapper.getCommentById(id));
    }

    /**
     * 添加评论内容
     *
     * @param commentDto
     */
    @Override
    public void insertComment(CommentDto commentDto) {
        commentMapper.insertComment(commentDto);
    }

    /**
     * 更新评论内容
     *
     * @param commentDto
     */
    @Override
    public void updateComment(CommentDto commentDto) {
        commentMapper.updateComment(commentDto);
    }

    /**
     * 通过评论ID，删除评论内容
     *
     * @param id
     */
    @Override
    public void deleteComment(Long id) {
        commentMapper.deleteComment(id);
    }

    /**
     * @param dailyId 日志ID
     *                通过日志ID，查询对应的评论内容
     * @return
     */
    @Override
    public List<CommentDto> getCommentDtoList(Long dailyId) {
        List<CommentDto> commentDtoList = new ArrayList<>();
        List<Comment> commentList = commentMapper.getCommentList(dailyId);
        if (null == commentDtoList) {
            throw new CustomException(CustomErrorMsg.QUERY_ERROR);
        }
        for (Comment comment : commentList) {
            commentDtoList.add(getCommentDtoFromComment(comment));
        }
        return commentDtoList;
    }

    /**
     * 封装Comment对象
     *
     * @param comment
     * @return
     */
    private CommentDto getCommentDtoFromComment(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setContent(comment.getContent());
        commentDto.setCreateTime(comment.getCreateTime().toString());
        commentDto.setDailyId(comment.getDailyId());
        return commentDto;
    }
}

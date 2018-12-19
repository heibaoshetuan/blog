package xyz.yescn.blog.dao;

import org.springframework.stereotype.Repository;
import xyz.yescn.blog.domain.Picture;
import xyz.yescn.blog.dto.DailyDto;
import xyz.yescn.blog.dto.PictureDto;

import java.util.List;

/**
 * @author issuser
 */
@Repository
public interface PictureMapper {
    /**
     * 查询相片信息
     * @param id
     * @return
     */
    Picture getPictureById(Long id);

    /**
     * 保存图片信息
     * @param pictureDto
     */
    void insertPicture(PictureDto pictureDto);

    /**
     * 更新图片信息
     * @param pictureDto
     */
    void updatePicture(PictureDto pictureDto);

    /**
     * 删除图片信息
     * @param id
     */
    void deletePicture(Long id);

    /**
     * 查询日志图片信息
     * @param dailyId
     * @return
     */
    List<Picture> getPictureList(Long dailyId);
}

package xyz.yescn.blog.dao;

import xyz.yescn.blog.dto.DailyDto;

import java.util.List;

/**
 * @author issuser
 */
public interface PictureMapper {
    DailyDto getDailyById(Long id);
    void insertDaily(DailyDto dailyDto);
    void updateDaily(DailyDto dailyDto);
    void deleteDaily(Long id);
    List<DailyDto> getDailyList();
}

package xyz.yescn.blog.dao;

import xyz.yescn.blog.dto.DailyDto;

import java.util.List;

/**
 * @author issuser
 */
public interface DailyMapper {
    DailyDto getDailyById(Long id);
    void insertDaily(DailyDto dailyDto);
    void updateDaily(DailyDto dailyDto);
    void deleteDaily(Long id);
    List<DailyDto> getDailyList();
}

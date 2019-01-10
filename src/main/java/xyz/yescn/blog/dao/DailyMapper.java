package xyz.yescn.blog.dao;

import org.springframework.stereotype.Repository;
import xyz.yescn.blog.domain.Daily;
import xyz.yescn.blog.dto.DailyDto;

import java.util.List;

/**
 * @author issuser
 */
@Repository
public interface DailyMapper {
    Daily getDailyById(Long id);
    void insertDaily(DailyDto dailyDto);
    void updateDaily(DailyDto dailyDto);
    void deleteDaily(Long id);
    List<Daily> getDailyList();
    Long findDailyCount(Long urId);
}

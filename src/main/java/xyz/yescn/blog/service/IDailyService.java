package xyz.yescn.blog.service;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import xyz.yescn.blog.dto.DailyDto;

import java.util.List;

public interface IDailyService {
    DailyDto getDailyById(Long id);
    void insertDaily(DailyDto dailyDto);
    void updateDaily(DailyDto dailyDto);
    void deleteDaily(Long id);
    List<DailyDto> getDailyList();
}
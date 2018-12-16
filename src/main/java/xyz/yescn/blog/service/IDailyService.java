package xyz.yescn.blog.service;

import xyz.yescn.blog.dto.DailyDto;

import java.util.List;

public interface IDailyService {
    DailyDto getDailyById(Long id);
    List<DailyDto> getDailyList();
}

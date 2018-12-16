package xyz.yescn.blog.service.impl;

import org.springframework.stereotype.Service;
import xyz.yescn.blog.dto.DailyDto;
import xyz.yescn.blog.service.IDailyService;

import java.util.List;

@Service("dailyService")
public class IDailyServiceImpl implements IDailyService {
    @Override
    public DailyDto getDailyById(Long id) {
        return null;
    }

    @Override
    public void insertDaily(DailyDto dailyDto) {

    }

    @Override
    public void updateDaily(DailyDto dailyDto) {

    }

    @Override
    public void deleteDaily(Long id) {

    }

    @Override
    public List<DailyDto> getDailyList() {
        return null;
    }
}

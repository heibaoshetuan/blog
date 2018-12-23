package xyz.yescn.blog.service;


import xyz.yescn.blog.dto.DailyDto;

import java.util.List;

/**
 * @author gavin
 */
public interface IDailyService {
    /**
     * 查询日志信息
     * @param id
     * @return
     */
    DailyDto getDailyById(Long id);

    /**
     * 添加日志
     * @param dailyDto
     */
    void insertDaily(DailyDto dailyDto);

    /**
     * 更新日志
     * @param dailyDto
     */
    void updateDaily(DailyDto dailyDto);

    /**
     * 删除日志
     * @param id
     */
    void deleteDaily(Long id);

    /**
     * 获取日志列表，并分页形式展示
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<DailyDto> getDailyList(Integer pageNum,Integer pageSize);
}

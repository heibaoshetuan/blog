package xyz.yescn.blog.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import xyz.yescn.blog.domain.Daily;
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
     * 首页查询日志列表，默认获取10条记录
     * @return
     */
    List<DailyDto> getDailyList();
    /**
     * 通过用户ID，查询取日志列表，并分页形式展示
     * @param pageNum
     * @param pageSize
     * @param urId
     * @return
     */
    PageInfo<Daily> getDailyPageList(Integer pageNum, Integer pageSize, Long urId);
}

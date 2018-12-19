package xyz.yescn.blog.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.yescn.blog.dao.DailyMapper;
import xyz.yescn.blog.dao.PictureMapper;
import xyz.yescn.blog.domain.Daily;
import xyz.yescn.blog.dto.DailyDto;
import xyz.yescn.blog.service.IDailyService;

import java.util.ArrayList;
import java.util.List;


/**
 * @author issuser
 */
@Service("dailyService")
public class IDailyServiceImpl implements IDailyService {
    @Autowired
    private DailyMapper dailyMapper;
    @Autowired
    private PictureMapper pictureMapper;
    @Override
    public DailyDto getDailyById(Long id) {
        return getDailyDtoFromDaily(dailyMapper.getDailyById(id));
    }

    @Override
    public void insertDaily(DailyDto dailyDto) {
        dailyMapper.insertDaily(dailyDto);
    }

    @Override
    public void updateDaily(DailyDto dailyDto) {
        dailyMapper.updateDaily(dailyDto);
    }

    @Override
    public void deleteDaily(Long id) {
        dailyMapper.deleteDaily(id);
    }

    @Override
    public List<DailyDto> getDailyList(Integer pageNum,Integer pageSize) {
        List<DailyDto> dailyDtoList = new ArrayList<>();
        PageHelper.startPage(pageNum, pageSize);
        List<Daily> dailyList = dailyMapper.getDailyList();
        for(Daily daily:dailyList){
            dailyDtoList.add(getDailyDtoFromDaily(daily));
        }
        return dailyDtoList;
    }

    /**
     * 日志对象封装DailyDto
     * @param daily
     * @return
     */
    private DailyDto getDailyDtoFromDaily(Daily daily){
        DailyDto dailyDto = new DailyDto();
        dailyDto.setId(daily.getId());
        dailyDto.setTitle(daily.getTitle());
        dailyDto.setContent(daily.getContent());
        dailyDto.setCreateTime(daily.getCreateTime());
        return dailyDto;
    }
}

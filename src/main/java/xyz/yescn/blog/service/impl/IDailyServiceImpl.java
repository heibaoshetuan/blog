package xyz.yescn.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import xyz.yescn.blog.common.DateFormatUtil;
import xyz.yescn.blog.dao.CategoryMapper;
import xyz.yescn.blog.dao.DailyMapper;
import xyz.yescn.blog.dao.PictureMapper;
import xyz.yescn.blog.domain.Category;
import xyz.yescn.blog.domain.Daily;
import xyz.yescn.blog.dto.DailyDto;
import xyz.yescn.blog.service.IDailyService;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


/**
 * @author issuser
 */
@Service("dailyService")
public class IDailyServiceImpl implements IDailyService {
    @Autowired
    private DailyMapper dailyMapper;
    @Autowired
    private PictureMapper pictureMapper;
    @Autowired
    private CategoryMapper categoryMapper;


    /**
     * 查询日志信息
     *
     * @param id
     * @return
     */
    @Override
    public DailyDto getDailyById(Long id) {
        return getDailyDtoFromDaily(dailyMapper.getDailyById(id), true);
    }

    @Override
    @Transactional
    public void insertDaily(DailyDto dailyDto) {
        dailyMapper.insertDaily(dailyDto);
    }

    @Override
    @Transactional
    public void updateDaily(DailyDto dailyDto) {
        dailyMapper.updateDaily(dailyDto);
    }

    @Override
    @Transactional
    public void deleteDaily(Long id) {
        dailyMapper.deleteDaily(id);
    }

    /**
     * 首页查询日志列表，默认获取按创建时间倒序排列10条记录
     * @return
     */
    @Override
    public List<DailyDto> getDailyList() {
        List<DailyDto> dailyDtoList = new ArrayList<>();
        PageHelper.startPage(1, 10);
        List<Daily> dailyList = dailyMapper.getDailyList();
        for (Daily daily : dailyList) {
            dailyDtoList.add(getDailyDtoFromDaily(daily, false));
        }
        return dailyDtoList;
    }

    /**
     * 通过用户ID，查询取日志列表，并分页形式展示
     *
     * @param pageNum
     * @param pageSize
     * @param urId
     * @return
     */
    @Override
    public PageInfo<Daily> getDailyPageList(Integer pageNum, Integer pageSize, Long urId) {
        PageHelper.startPage(pageNum, pageSize);
        List<Daily> dailyList = dailyMapper.getDailyList();
        return new PageInfo<>(dailyList,pageSize);
    }

    /**
     * 日志对象封装DailyDto
     *
     * @param daily
     * @return
     */
    private DailyDto getDailyDtoFromDaily(Daily daily, boolean flag) {
        DailyDto dailyDto = new DailyDto();
        if (daily != null) {
            dailyDto.setId(daily.getId());
            dailyDto.setTitle(daily.getTitle());
            dailyDto.setCgId(daily.getCgId());
            if (flag) {
                dailyDto.setContent(daily.getContent());
            } else {
                dailyDto.setContent(getFilerDailyContent(daily.getContent()));
            }
            dailyDto.setCreateTime(DateFormatUtil.simpleDateFormat(daily.getCreateTime()));
            dailyDto.setCategory(categoryMapper.getCategoryById(daily.getCgId()));
        }
        return dailyDto;
    }

    private String getFilerDailyContent(String content) {
        if (StringUtils.isEmpty(content)) {
            return null;
        }
        String htmlStr = content;
        String textStr = "";
        java.util.regex.Pattern p_script;
        java.util.regex.Matcher m_script;
        java.util.regex.Pattern p_style;
        java.util.regex.Matcher m_style;
        java.util.regex.Pattern p_html;
        java.util.regex.Matcher m_html;

        java.util.regex.Pattern p_html1;
        java.util.regex.Matcher m_html1;
        try {
            // 定义script的正则表达式{或<script[^>]*?>[\\s\\S]*?<\\/script>
            String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";
            // 定义style的正则表达式{或<style[^>]*?>[\\s\\S]*?<\\/style>
            String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>";
            // 定义HTML标签的正则表达式
            String regEx_html = "<[^>]+>";
            String regEx_html1 = "<[^>]+";
            p_script = Pattern.compile(regEx_script,
                    Pattern.CASE_INSENSITIVE);
            m_script = p_script.matcher(htmlStr);
            // 过滤script标签
            htmlStr = m_script.replaceAll("");
            p_style = Pattern
                    .compile(regEx_style, Pattern.CASE_INSENSITIVE);
            // 过滤style标签
            m_style = p_style.matcher(htmlStr);
            htmlStr = m_style.replaceAll("");
            p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
            m_html = p_html.matcher(htmlStr);
            // 过滤html标签
            htmlStr = m_html.replaceAll("");
            p_html1 = Pattern.compile(regEx_html1, Pattern.CASE_INSENSITIVE);
            m_html1 = p_html1.matcher(htmlStr);
            // 过滤html标签
            htmlStr = m_html1.replaceAll("");
            textStr = htmlStr;
            // 替换&amp;nbsp;
            textStr = textStr.replaceAll("&amp;", "").replaceAll("nbsp;", "");
            if (textStr.length() > 200) {
                textStr = textStr.substring(0, 200).replaceAll("&","");
            }
        } catch (Exception e) {
            System.err.println("Html2Text: " + e.getMessage());
        }
        return textStr;
    }
}

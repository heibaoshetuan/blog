package xyz.yescn.blog.dto;

import xyz.yescn.blog.domain.Daily;

/**
 * @author issuser
 */
public class PictureDto{

    /**
     * 相片ID
     */
    private Long id;
    /**
     * 相片服务器地址
     */
    private String url;
    /**
     * 相片描述
     */
    private String description;
    /**
     * 相片上传时间
     */
    private String createTime;
    /**
     * 日志信息表，用于关联日志上传图片
     */
    private DailyDto dailyDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DailyDto getDailyDto() {
        return dailyDto;
    }

    public void setDailyDto(DailyDto dailyDto) {
        this.dailyDto = dailyDto;
    }

    @Override
    public String toString() {
        return "PictureDto{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                ", dailyDto=" + dailyDto +
                '}';
    }
}

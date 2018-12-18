package xyz.yescn.blog.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author issuser
 */
public class Picture implements Serializable {
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
    private String desc;
    /**
     * 相片上传时间
     */
    private Timestamp createTime;
    /**
     * 相片上传排序
     */
    private Integer sort;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", desc='" + desc + '\'' +
                ", createTime=" + createTime +
                ", sort=" + sort +
                '}';
    }
}

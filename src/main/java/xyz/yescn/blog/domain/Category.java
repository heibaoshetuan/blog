package xyz.yescn.blog.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author issuser
 * 日志分类
 */
public class Category implements Serializable {
    /**
     * 日志分类ID
     */
    private Long id;
    /**
     * 日志分类名称
     */
    private String name;
    /**
     * 日志分类描述
     */
    private String desc;
    /**
     * 日志分类创建时间
     */
    private Timestamp createTime;
    /**
     * 日志分类排序
     */
    private Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", createTime=" + createTime +
                ", sort=" + sort +
                '}';
    }
}

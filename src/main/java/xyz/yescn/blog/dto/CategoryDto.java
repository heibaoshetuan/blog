package xyz.yescn.blog.dto;



/**
 * @author issuser
 */
public class CategoryDto{
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
    private String description;
    /**
     * 日志分类排序
     */
    private Integer level;
    /**
     * 日志分类创建时间
     */
    private String createTime;
    /**
     * 日志分类更新时间
     */
    private String updateTime;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}

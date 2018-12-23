package xyz.yescn.blog.service;

import xyz.yescn.blog.dto.CategoryDto;

import java.util.List;

/**
 * @author gavin
 */
public interface ICategoryService {
    /**
     * 查询日志分类
     * @param id
     * @return
     */
    CategoryDto getCategoryId(Long id);

    /**
     * 添加日志分类
     * @param categoryDto
     */
    void insertCategory(CategoryDto categoryDto);

    /**
     * 更新日志分类
     * @param categoryDto
     */
    void updateCategory(CategoryDto categoryDto);

    /**
     * 删除日志分类
     * @param id
     */
    void deleteCategory(Long id);

    /**
     *
     * @return
     */
    List<CategoryDto> getCategoryList();
}

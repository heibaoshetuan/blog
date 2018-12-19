package xyz.yescn.blog.dao;

import xyz.yescn.blog.domain.Category;
import xyz.yescn.blog.dto.CategoryDto;
import xyz.yescn.blog.dto.DailyDto;

import java.util.List;

/**
 * @author issuser
 */
public interface CategoryMapper {
    /**
     * 通过ID，查询分类
     * @param id
     * @return
     */
    Category getCategoryById(Long id);
    void insertCategory(CategoryDto categoryDto);
    void updateCategory(CategoryDto categoryDto);
    void deleteCategory(Long id);
    List<Category> getCategoryList();
}

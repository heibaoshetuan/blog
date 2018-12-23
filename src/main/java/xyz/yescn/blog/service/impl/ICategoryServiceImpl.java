package xyz.yescn.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.yescn.blog.dao.CategoryMapper;
import xyz.yescn.blog.domain.Category;
import xyz.yescn.blog.dto.CategoryDto;
import xyz.yescn.blog.service.ICategoryService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gavin
 * @date 2018-12-22 14:07
 */
@Service("categoryService")
public class ICategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 查询日志分类
     *
     * @param id
     * @return
     */
    @Override
    public CategoryDto getCategoryId(Long id) {
        return getCategoryDtoFromCategory(categoryMapper.getCategoryById(id));
    }

    /**
     * 添加日志分类
     *
     * @param categoryDto
     */
    @Override
    public void insertCategory(CategoryDto categoryDto) {
        categoryMapper.insertCategory(categoryDto);
    }

    /**
     * 更新日志分类
     *
     * @param categoryDto
     */
    @Override
    public void updateCategory(CategoryDto categoryDto) {
        categoryMapper.updateCategory(categoryDto);
    }

    /**
     * 删除日志分类
     *
     * @param id
     */
    @Override
    public void deleteCategory(Long id) {
        categoryMapper.deleteCategory(id);
    }

    /**
     * 获取日志列表
     * @return
     */
    @Override
    public List<CategoryDto> getCategoryList() {
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        List<Category> categoryList = categoryMapper.getCategoryList();
        if (categoryList != null && categoryList.size() > 0) {
            for (Category category : categoryList) {
                categoryDtoList.add(getCategoryDtoFromCategory(category));
            }
        }
        return categoryDtoList;
    }

    /**
     * 日志分类对象vo转换
     *
     * @param category
     * @return
     */
    private CategoryDto getCategoryDtoFromCategory(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        if (category != null) {
            categoryDto.setId(category.getId());
            categoryDto.setName(category.getName());
        }
        return categoryDto;
    }
}

package xyz.yescn.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import xyz.yescn.blog.domain.Category;
import xyz.yescn.blog.dto.DailyDto;
import xyz.yescn.blog.dto.UserDto;
import xyz.yescn.blog.service.ICategoryService;
import xyz.yescn.blog.service.IDailyService;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author gavin
 */
@Controller
@RequestMapping("/daily")
public class DailyController {
    @Autowired
    private IDailyService dailyService;
    @Autowired
    private ICategoryService categoryService;

    /**
     * 获取日志信息
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        model.addAttribute("daily", dailyService.getDailyById(id));
        return "daily/view";
    }

    /**
     * 获取日志列表，并以分页形式展示
     *
     * @param model
     * @return
     */
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("dailyList", dailyService.getDailyList(1, 10));
        return "daily/list";
    }

    @GetMapping("/form")
    public String createForm(Model model) {
        model.addAttribute("daily", new DailyDto());
        model.addAttribute("categoryList", categoryService.getCategoryList());
        model.addAttribute("title", "新增日志");
        return "daily/form";
    }

    @PostMapping()
    public String saveOrUpdateUser(HttpServletRequest request, DailyDto dailyDto) {
        dailyDto.setCreateTime(new Timestamp(System.currentTimeMillis()).toString());
        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
        dailyDto.setUrId(userDto.getId());
        if (null != dailyDto && null != dailyDto.getId()) {
            dailyService.updateDaily(dailyDto);
        } else {
            dailyService.insertDaily(dailyDto);
        }
        return "redirect:/daily/list";
    }

    /**
     * 获取修改用户的页面
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "/modify/{id}")
    public String modify(@PathVariable("id") Long id, Model model) {
        model.addAttribute("daily", dailyService.getDailyById(id));
        model.addAttribute("categoryList", categoryService.getCategoryList());
        model.addAttribute("title", "修改日志");
        return "daily/form";
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @GetMapping(value = "delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        dailyService.deleteDaily(id);
        return "redirect:/daily/list";
    }
}

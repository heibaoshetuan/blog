package xyz.yescn.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.yescn.blog.dto.DailyDto;
import xyz.yescn.blog.service.IDailyService;

import java.util.List;

@Controller
@RequestMapping("/admin/daily")
public class DailyController {
    @Autowired
    private IDailyService dailyService;

    @RequestMapping(value = "/getDaily", method = RequestMethod.GET)
    public DailyDto getDailyById(Long id) {
        return dailyService.getDailyById(id);
    }

//    @RequestMapping(value = "/getDailyList", method = RequestMethod.GET)
//    public List<DailyDto> getDailyList() {
//        return dailyService.getDailyList();
//    }
}

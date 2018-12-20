package xyz.yescn.blog.interceptor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import xyz.yescn.blog.dto.UserDto;
import xyz.yescn.blog.exception.CustomException;
import xyz.yescn.blog.msg.CustomErrorMsg;
import xyz.yescn.blog.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author issuser
 */
@Component
public class AuthorityInterceptor implements HandlerInterceptor {
    @Autowired
    private IUserService userService;

    /**
     * 视图渲染之后的操作
     *
     * @param request
     * @param response
     * @param obj
     * @param e
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) {

    }

    /**
     * 处理请求完成后视图渲染之前的处理操作
     *
     * @param request
     * @param response
     * @param obj
     * @param modelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView) {
        //throw new CustomException(CustomErrorMsg.QUERY_ERROR);
    }

    /**
     * 请求资源之前，进行权限验证
     *
     * @param request
     * @param response
     * @param obj
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws IOException {
        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
        String url = request.getServletPath();
        if (null == userDto) {
            request.getSession().setAttribute("skipUrl",url);
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }

//        UserDto userDto = userService.getLoginUserByToKey(toKey);
//        if (null == userDto) {
//            response.sendRedirect(request.getContextPath() + "/toLogin");
//            return false;
//        }
//        request.getSession().setAttribute("toKey", userDto.getToKey());
//        response.sendRedirect(request.getServletPath());
        return true;
    }
}

//package xyz.yescn.blog.configuration;
//
//
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import xyz.yescn.blog.interceptor.AuthorityInterceptor;;import javax.annotation.Resource;
//
///**
// * @author issuser
// */
//@Configuration
//public class InterceptorConfig implements WebMvcConfigurer {
//    @Resource
//    private AuthorityInterceptor  authorityInterceptor;
//
//    /**
//     *  自定义拦截器，添加拦截路径和排除拦截路径
//     * @param registry
//     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 自定义拦截器，添加拦截路径和排除拦截路径
//        registry.addInterceptor(authorityInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/static/**")
//                .excludePathPatterns("toLogin")
//                .excludePathPatterns("login");
//    }
//}

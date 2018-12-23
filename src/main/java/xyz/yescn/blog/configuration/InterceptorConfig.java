package xyz.yescn.blog.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.yescn.blog.interceptor.AuthorityInterceptor;;import javax.annotation.Resource;

/**
 * @author issuser
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private AuthorityInterceptor authorityInterceptor;

    /**
     * 自定义拦截器，添加拦截路径和排除拦截路径
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 自定义拦截器，添加拦截路径和排除拦截路径
        registry.addInterceptor(authorityInterceptor)
                .addPathPatterns("/**","/daily/form","form.html")
                .excludePathPatterns("/", "/static/**", "/css/**", "/js/**", "/assets/js/**", "/assets/css/**",
                        "/dist/js/**", "/dist/css/**", "/index.html", "/index", "/login",
                        "/login.html", "/daily/list", "/picture/list", "/daily/*", "/view.html",
                        "/technology/list", "/user", "/assets/js/vendor/**", "/ueditor/**");
    }

    /**
     *  通过addResourceHandler添加映射路径，然后通过addResourceLocations来指定路径。
     *  我们访问自定义my文件夹中的elephant.jpg 图片的地址为 http://localhost:8080/my/elephant.jpg
     * @param registry
     *  addResourceLocations指的是文件放置的目录，
     *  addResoureHandler指的是对外暴露的访问路径
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //指定外部目录
    }

}

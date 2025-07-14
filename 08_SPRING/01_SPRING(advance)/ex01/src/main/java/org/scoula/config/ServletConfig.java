package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages = {"org.scoula.controller"}) // Spring MVC용 컴포넌트 등록을 위한 스캔 패키지
// Spring MVC 컴포넌트(@Controller 등)를 찾기 위해 org.scoula.controller 패키지를 스캔함
public class ServletConfig implements WebMvcConfigurer {

    // 정적 리소스(css, js, 이미지 등)의 경로를 설정
    // 예: /resources/img/a.png 요청 시, 실제 경로는 /webapp/resources/img/a.png
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**")      // 클라이언트 요청 URL 패턴
                .addResourceLocations("/resources/");     // 해당 URL이 매핑될 실제 리소스 위치
    }

    // JSP 뷰 resolver 설정
    // Controller에서 반환한 View 이름을 기반으로 JSP 파일을 찾도록 설정
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();

        bean.setViewClass(JstlView.class);            // JSTL 지원 JSP 뷰로 설정
        bean.setPrefix("/WEB-INF/views/");            // JSP 파일들이 위치한 경로
        bean.setSuffix(".jsp");                       // 확장자 설정

        registry.viewResolver(bean);                  // 설정한 뷰 리졸버 등록
    }
}
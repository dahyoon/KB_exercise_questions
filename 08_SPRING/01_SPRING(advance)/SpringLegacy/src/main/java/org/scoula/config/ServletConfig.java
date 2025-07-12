package org.scoula.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc // Spring MVC 구성 활성화: DispatcherServlet에 필요한 기본 설정 자동 적용 (예, RequestMappingHandlerMapping, RequestMappingHandlerAdapter 등이 등록됨)
@ComponentScan(basePackages={"org.scoula.controller"}) // Spring MVC용 컴포넌트 등록을 위한 스캔 패키지: 해당 controller 안의 @Controller, @RestController, @Service 등의 컴포넌트를 자동 스캔하여 Bean으로 등록
public class ServletConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) { // 정적 자원 경로 매핑
        registry
                .addResourceHandler("/resources/**") // url이 /resources/로 시작하는 모든 경로를
                .addResourceLocations("/resources/");             // webapp/resources/경로 로 매핑 -> /resources/** 로 들어오는 URL 요청을 webapp/resources/ 폴더 안의 실제 정적 파일들과 매핑
                // 예시) /resources/css/style.css 요청 시 webapp/resources/css/style.css 파일 반환
    }
    // JSP View Resolver 설정: JSP 같은 뷰(View)를 반환하기 위한 ViewResolver 설정
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver bean = new InternalResourceViewResolver(); // JSP 파일을 반환할 수 있도록 해주는 View Resolver 객체 생성
        bean.setViewClass(JstlView.class); // JSTL 사용하기 위한 설정
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        registry.viewResolver(bean); // View Resolver 객체를 Spring MVC에 등록, 뷰 처리 시 사용될 것
    }
}

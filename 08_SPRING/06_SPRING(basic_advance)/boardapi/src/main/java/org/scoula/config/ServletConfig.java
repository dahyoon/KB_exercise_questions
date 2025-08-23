package org.scoula.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages = {
        "org.scoula.controller",
        "org.scoula.ex03.controller",
        "org.scoula.exception",
        "org.scoula.board.controller",
        "org.scoula.weather.controller"
})	// Spring MVC용 컴포넌트 등록을 위한 스캔 패키지
public class ServletConfig implements WebMvcConfigurer {
    //	Servlet ${WEB_XML_VERSION} 파일 업로드 사용시 - MultipartResolver Bean 등록
    @Bean
    public MultipartResolver multipartResolver() {
        StandardServletMultipartResolver resolver = new StandardServletMultipartResolver();
        return resolver;
    }

    //프론트파일(css, js, img)의 위치를 지정해주는 함수
    // /resources/img/a.png라고 요청이 들어오면
    // /resources/밑에서 찾겠다라는 설정
    // <img src="/resources/img/a.png">

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 기본 리소스 핸들러 설정
        registry
                .addResourceHandler("/resources/**")     // URL 패턴: /resources/로 시작하는 모든 요청
                .addResourceLocations("/resources/");    // 매핑될 실제 경로: webapp/resources/ 디렉토리

        // Swagger UI 리소스
        registry
                .addResourceHandler("/swagger-ui.html") // URL 패턴: /swagger-ui.html (정확한 경로 매칭)
                .addResourceLocations("classpath:/META-INF/resources/"); // 매핑될 실제 경로: JAR 파일 내의 META-INF/resources/ 경로

        // Swagger WebJar 리소스
        registry
                .addResourceHandler("/webjars/**") // URL 패턴: /webjars/로 시작하는 모든 요청
                .addResourceLocations("classpath:/META-INF/resources/webjars/"); // 매핑될 실제 경로: JAR 파일 내의 META-INF/resources/webjars/ 경로 (역할: Swagger UI에서 사용하는 JavaScript, CSS 등 정적 리소스 제공)

        // Swagger 설정 리소스
        registry
                .addResourceHandler("/swagger-resources/**") // URL 패턴: /swagger-resources/로 시작하는 모든 요청
                .addResourceLocations("/classpath:/META-INF/resources/"); // 매핑될 실제 경로: JAR 파일 내의 META-INF/resources/ 경로 (역할: Swagger 설정 정보 및 메타데이터 제공)

        // API 문저 JSON 데이터 리소스
        registry
                .addResourceHandler("/v2/api-docs") // URL 패턴: /v2/api-docs (정확한 경로 매칭)
                .addResourceLocations("classpath:/META-INF/resources/"); // 매핑될 실제 경로: JAR 파일 내의 META-INF/resources/ 경로 (역할: API 명세서를 JSON 형태로 제공 (Swagger UI가 이 데이터를 읽어서 화면 구성))
    }

    // jsp view resolver 설정
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();

        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");

        registry.viewResolver(bean);
    }
}
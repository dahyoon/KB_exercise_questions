package org.scoula.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    // 루트 컨텍스트 설정 클래스 (비웹 설정: 서비스, DAO 등)
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    // 서블릿 컨텍스트 설정 클래스 (웹 설정: 컨트롤러, 뷰 등)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfig.class};
    }

    // DispatcherServlet이 모든 요청("/")을 처리하도록 설정
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // POST 요청 데이터 한글 깨짐 방지를 위한 인코딩 필터 설정
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");         // UTF-8 인코딩 지정
        characterEncodingFilter.setForceEncoding(true);       // 항상 UTF-8 적용
        return new Filter[]{characterEncodingFilter};
    }
}
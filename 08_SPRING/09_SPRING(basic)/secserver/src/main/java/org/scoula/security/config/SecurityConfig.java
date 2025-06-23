package org.scoula.security.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
@EnableWebSecurity
@Log4j2
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // 문자셋 필터
    public CharacterEncodingFilter encodingFilter() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        return encodingFilter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(encodingFilter(), CsrfFilter.class);

        // 경로별 접근 권한 설정
        http.authorizeRequests()
                .antMatchers("/security/all").permitAll()
                .antMatchers("/security/admin").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/security/member").access("hasAnyRole('ROLE_MEMBER', 'ROLE_ADMIN')");

        // form 기반 로그인 활성화, 나머지는 모두 default
        // http.formLogin();
        http.formLogin()
                .loginPage("/security/login")
                .loginProcessingUrl("/security/login")
                .defaultSuccessUrl("/");

        // 로그아웃 설정
        http.logout()
                .logoutUrl("/security/logout") // POST: 로그아웃 호출 Url
                .invalidateHttpSession(true)   // 세션 invalidate
                .deleteCookies("remember-me", "JSESSION-ID") // 삭제할 쿠키 목록
                .logoutSuccessUrl("/security/logout"); // GET: 로그아웃 후 이동할 화면
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
        throws Exception {
            log.info("configure...............");
            auth.inMemoryAuthentication()
                    .withUser("admin")
                    // .password("{noop}1234")
                    .password("$2a$10$JFnsx7E7/4o0tYdqSwDtnOfv2ZHvnhCqHjhBJzqGm4w9sj/WboC62")
                    .roles("ADMIN", "MEMBER"); // ROLE_ADMIN
            auth.inMemoryAuthentication()
                    .withUser("member")
                    // .password("{noop}1234")
                    .password("$2a$10$diFQAu8Lciq7tXCzbTKTeuyjc0HXywTY4VZs/x5GvHBjm8YI9nEaO")
                    .roles("MEMBER");
    }

}

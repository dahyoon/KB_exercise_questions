package org.scoula.ex04.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns={"/*"})
public class CharacterEncodeFilter implements Filter {
    @Override
    public void init(FilterConfig fConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        chain.doFilter(req, resp);
    }
    @Override
    public void destroy() {}
}

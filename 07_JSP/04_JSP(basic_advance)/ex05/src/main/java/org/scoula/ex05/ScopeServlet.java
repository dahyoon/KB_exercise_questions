package org.scoula.ex05;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import org.scoula.ex05.domain.Member;

@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {
    ServletContext sc;

    @Override
    public void init(ServletConfig config) throws ServletException {
        sc = config.getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        sc.setAttribute("scopeName", "applicationScope 값"); // Application Scope

        HttpSession session = request.getSession(); // Session Scope
        session.setAttribute("scopeName", "sessionScope 값");

        request.setAttribute("scopeName", "requestScope  값"); // Request Scope
        Member member = new Member("홍길동", "hong");
        request.setAttribute("member", member);

        request.getRequestDispatcher("scope.jsp").forward(request, response);
    }
}

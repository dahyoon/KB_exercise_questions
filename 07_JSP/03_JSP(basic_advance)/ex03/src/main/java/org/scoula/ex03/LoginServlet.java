package org.scoula.ex03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/login", "/"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 요청에서 파라미터 얻기
        String userid = req.getParameter("userid");
        String passwd = req.getParameter("passwd");

        // 응답 내보내기
        resp.setContentType("text/html; charset=UTF-8"); // 없을 경우 문자 깨짐 (?로 출력됨)
        PrintWriter out = resp.getWriter();
        out.print("<html><body>");
        out.print("아이디 값: " + userid + "<br>");
        out.print("비밀번호 값: " + passwd + "<br>");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); // 한글 깨짐 방지
        doGet(req, resp);
    }
}

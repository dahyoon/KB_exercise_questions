package org.scoula.ex02;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "myServlet", value = {"/xxx", "/yyy"})
public class HelloServlet extends HttpServlet {
    private String servletName;
    private String message;

    public void init() {
        servletName = "HelloServlet";
        message = "Hello World!";
        System.out.println(servletName + "의 init() 호출됨!");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + servletName + "</h1>");
        out.println("<p>" + message + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
        System.out.println(servletName + "의 destroy() 호출됨!");
    }
}
package org.scoula.ex06.servlet;

import org.scoula.ex06.command.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// @WebServlet 붙이지 않음
public class DispatcherServlet extends HttpServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;
    String prefix = "/WEB-INF/views/";
    String suffix = ".jsp";

    @Override
    public void init() {
        getMap = new HashMap<>();
        postMap = new HashMap<>();
        createMap(getMap, postMap);
    }

    // 자식 클래스에서 Override할 메소드
    protected void createMap(Map<String, Command> getMap, Map<String, Command> postMap) {}

    // 요청 주소 추출
    private String getCommandName(HttpServletRequest req) {
        String requestURI = req.getRequestURI();
        String contextPath = req.getContextPath();
        return requestURI.substring(contextPath.length());
    }

    private Command getCommand(HttpServletRequest req) {
        String commandName = getCommandName(req); //요청 주소를 추출하는 메소드 호출
        Command command; // 처리할 메소드가 구현될 객체
        if(req.getMethod().equalsIgnoreCase("GET")) { // 요청 METHOD에 따른 처리 메소드 담기
            command = getMap.get(commandName);
        } else { command = postMap.get(commandName); }
        return command;
    }

    // 실제로 처리를 하고 view파일 이름을 반환하는 메소드
    public void execute(Command command,
                        HttpServletRequest req,
                        HttpServletResponse resp ) throws IOException, ServletException {
        String viewName = command.execute(req, resp);
        // 해쉬맵에서 가지고 온 객체의 메소드(create(), update(),...)를 실행시켜 줌
        // 처리 후 view파일 이름 또는 리다이렉트할 url을 반환할 것
        if (viewName.startsWith("redirect:")) {
            resp.sendRedirect(viewName.substring("redirect:".length()));
        } else {
            String view = prefix + viewName + suffix;
            RequestDispatcher dis = req.getRequestDispatcher(view);
            dis.forward(req, resp);
        }
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Command command = getCommand(req);
        if(command != null) {
            execute(command, req, resp);
        } else { // 404 에러 처리
            String view = prefix + "404" + suffix;
            RequestDispatcher dis = req.getRequestDispatcher(view);
            dis.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post요청도 get요청과 동일하게 처리하는 경우 doGet() 호출
        doGet(req, resp);
    }
}
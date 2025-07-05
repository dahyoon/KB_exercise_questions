package org.scoula.ex04.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cart_save_cookie")
public class CartSaveCookieServlet extends HttpServlet {
    @Override
    // GET 방식으로 요청이 오면 실행되는 함수 (예: /cart_save_cookie?product=BMW)
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter(); // 브라우저 화면에 글자 출력 준비
        // 입력 파라미터 값 얻기
        String product = req.getParameter("product"); // "BMW"
        // 기존 쿠키 얻기
        Cookie [] cookies = req.getCookies();
        Cookie c = null;
        int productCookieCount = 0;

        if (cookies == null || cookies.length == 0) { // 쿠키 없을 경우 (첫 방문)
            c = new Cookie("product1", product);
        } else { // 보통 새 브라우저를 열면 JSESSIONID라는 쿠키가 자동 생성되기에 여기서 실행될 것
            // product로 시작하는 쿠키 세기
            for (Cookie cookie : cookies) {
                if (cookie.getName().startsWith("product")) {
                    productCookieCount++;
                }
            }
            // product 쿠키 생성
            if (productCookieCount == 0) {
                c = new Cookie("product1", product);
            } else {
                c = new Cookie("product" + (productCookieCount + 1), product);
            }
        }
        // 쿠키를 응답 처리
        // c.setMaxAge(60*60); // 3600초 = 1시간 유효 시간 설정
        resp.addCookie(c); // 만든 쿠키를 브라우저로 보냄

        out.print("<html><body>");
        out.print("Product 추가! <br>");
        out.print("<a href='cookie_product.jsp'>상품 선택 페이지</a><br>");
        out.print("<a href='cart_view_cookie'>장바구니 보기</a>");
        out.print("</body></html>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
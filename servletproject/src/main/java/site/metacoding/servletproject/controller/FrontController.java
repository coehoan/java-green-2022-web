package site.metacoding.servletproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http 최초 프로토콜 (get)
// http 1.0 프로토콜 (get,post)
// http 1.1 프로토콜 (get(주소로요청),post(폼태그),delete(자바스크립트),put(자바스크립트))

// http://localhost:80/front
@WebServlet("/front")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public FrontController() {
		System.out.println("나 메모리에 떴음ㅋ"); // 최초 요청시 1번만 실행
	} 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("front 컨트롤러로 요청 들어옴.");
		
		// 공통로직 처리
		
		// 1. 라우터 만들기
		String path = request.getParameter("path");
		System.out.println("path : "+ path);
		
		if(path.equals("login")) {
			response.sendRedirect("/login.jsp"); // 재요청
			// 로그인페이지 응답
//			PrintWriter out = response.getWriter();
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset=\"UTF-8\">");
//			out.println("<title>Insert title here</title>");
//			out.println("</head>");
//			out.println("<body>");
//			out.println("<h1>Login Page</h1>");
//			out.println("</body>");
//			out.println("</html>");
			
		} else if (path.equals("join")) {
			response.sendRedirect("/join.jsp");
			// 조인페이지 응답
//			PrintWriter out = response.getWriter();
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset=\"UTF-8\">");
//			out.println("<title>Insert title here</title>");
//			out.println("</head>");
//			out.println("<body>");
//			out.println("<h1>Join Page</h1>");
//			out.println("</body>");
//			out.println("</html>");
		}
	}
}

package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestinfo")
public class RequestInfo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();

		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>클라이언트 및 서버정보</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<ul>");
		out.println("<li style='list-style: none;'> 클라이언트IP : " + req.getRemoteAddr() + "</li>");
		out.println("<li style='list-style: none;'> 요청정보길이 : " + req.getContentLength() + "</li>");
		out.println("<li style='list-style: none;'> 요청정보 인코딩 : " + req.getCharacterEncoding() + "</li>");
		out.println("<li style='list-style: none;'> 요청정보 컨텐츠타입 : " + req.getContentType() + "</li>");
		out.println("<li style='list-style: none;'> 요청정보 프로토콜 :  " + req.getProtocol() + "</li>");
		out.println("<li style='list-style: none;'> 요청정보 전송방식 :  " + req.getMethod() + "</li>");
		out.println("<li style='list-style: none;'> 요청 URI : " + req.getRequestURI() + "</li>");
		out.println("<li style='list-style: none;'> 컨택스트 경로 : " + req.getContextPath() + "</li>");
		out.println("<li style='list-style: none;'> 서버이름 : " + req.getServerName() + "</li>");
		out.println("<li style='list-style: none;'> 서버포트 : " + req.getServerPort() + "</li>");
		out.println("</body>");
		out.println("</html>");
	
	}
	
}

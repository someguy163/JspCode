package Exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.Tomcat.ExistingStandardWrapper;

/**
 * Servlet implementation class 로그인페이지
 */
@WebServlet("/mainLoginServlet")
public class 로그인페이지 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public 로그인페이지() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String perNum1 = request.getParameter("perNum1");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String confrmPw = request.getParameter("confrmPw");
		String headEmail = request.getParameter("headEmail");
		String domain = request.getParameter("domain");
		String addressNum = request.getParameter("addressNum");
		String address = request.getParameter("address");
		String phoneNum = request.getParameter("phoneNum");
		String job = request.getParameter("job");
		String intresing[] = request.getParameterValues("intresing");

		
		
		out.print("<html><body>");
		out.print("이름 : " + name + "<br>");
		out.print("주민번호 : " + perNum1 + "<br>");
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pw + "<br>");
		out.print("이메일 : " + headEmail + "@" + domain + "<br>");
		out.print("우편번호 : " + addressNum + "<br>");
		out.print("주소 : " + address + "<br>");
		out.print("핸드폰번호 : " + phoneNum + "<br>");
		out.print("직업 : " + job + "<br>");
		out.print("관심분야 : ");
		int i =0;
		for(String inter:intresing) {
			out.print(" "+intresing[i]);
			i++;
		}
		out.print("<br>");
		out.print("<br><a href='javascript:history.back()'>다시</a>");
		out.print("</html></body>");
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

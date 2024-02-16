package Exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class 라디오버튼입력받기
 */
@WebServlet("/RadioServlet")
public class 라디오버튼입력받기 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public 라디오버튼입력받기() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String gender = request.getParameter("gender");
		String mailCheck = request.getParameter("checkMail");
		String intro = request.getParameter("intro");
		out.print("<html><body>");
		out.print("<h2>당신이 입력한 정보입니다</h2>");
		out.print("성별 : " + gender +"<br>");
		out.print("메일 정보 수신 여부 : " + mailCheck + "<br>");
		out.print("가입인사 : <br>" + intro);
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

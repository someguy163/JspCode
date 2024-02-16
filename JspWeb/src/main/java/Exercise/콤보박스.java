package Exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class 콤보박스
 */
@WebServlet("/SelectServlet")
public class 콤보박스 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public 콤보박스() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String job = request.getParameter("job");
		String favor[] = request.getParameterValues("favor");
		int i=0;
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("당신이 선택한 직업 : " + job);
		out.print("<hr>");
		out.print("당신이 선택한 관심 분야 : ");
		for(String favors : favor) {
			out.print(" " + favor[i]);
			i++;
		}
		out.print("<br><a href='javascript:history.back()'>다시</a>");
		out.print("</html></body>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package Exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class paramServlet
 */
@WebServlet("/paramServlet")
public class paramServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paramServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body><h2>당신이 입력한 정보입니다<h2><br>");
		out.print("아이디 : " + id + "<br>");
		out.print("나이 : " + age + "<br>");
		
		out.print("<br><a href='javascript:history.go(-1)'>다시)</a>"); //스크립트 이동 링크
		out.print("</body></html>");
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

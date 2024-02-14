package Exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryTestServlet
 */
@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<h1>GET 방식으로 요청되었습니다</h1>");
		out.print("</body></html>");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String hobbies[] = request.getParameterValues("hobby");
		String gender = request.getParameter("gender");
		String religion = request.getParameter("religion");
		String intro = request.getParameter("introduction");
		
		out.print("id : " + id + "<br/>");
		out.print("name : " + name + "<br/>");
		out.print("password : " + password + "<br/>");
		out.print("gender : " + gender + "<br/>");
		out.print("religion : " + religion + "<br/>");
		out.print("intro : " + intro + "<br/>");
		
//		for(int i =0; i<=hobbies.length; i++) {
//			out.print(hobbies[i] + " ");
//		}

		for (String hb:hobbies) {
			int i=0;
			out.print(hobbies[i]);
			i++;
		}
		out.print("전체 :"+request.getQueryString());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<h1>POST 방식으로 요청되었습니다</h1>");
		out.print("</body></html>");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String hobbies[] = request.getParameterValues("hobby");
		String gender = request.getParameter("gender");
		String religion = request.getParameter("religion");
		String intro = request.getParameter("introduction");
		
		out.print("id : " + id + "<br/>");
		out.print("name : " + name + "<br/>");
		out.print("password : " + password + "<br/>");
		out.print("gender : " + gender + "<br/>");
		out.print("religion : " + religion + "<br/>");
		out.print("intro : " + intro + "<br/>");
		
//		for(int i =0; i<=hobbies.length; i++) {
//			out.print(hobbies[i] + " ");
//		}

		for (String hb:hobbies) {
			int i=0;
			out.print(hobbies[i]);
			i++;
		}
		out.print("전체 :"+request.getQueryString());
	}

}

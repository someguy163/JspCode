package Exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LocalTestServlet
 */
@WebServlet("/Local")
public class LocalTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocalTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number =0;
		String str = request.getParameter("msg");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>MultiThread Test</title></head>");
		out.print("<body><h2>처리결과 (지역변수)</h2>");
		while (number++ <10) {
			out.print(str + " : " + number + "<br>");
			out.flush();
			System.out.println(str + " : " + number);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		out.print("<h2>Done " + str + "!!</h2>");
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

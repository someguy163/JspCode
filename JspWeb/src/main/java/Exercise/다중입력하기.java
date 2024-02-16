package Exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class 다중입력하기
 */
@WebServlet("/checkBoxServlet")
public class 다중입력하기 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public 다중입력하기() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String items[] = request.getParameterValues("item");
		int i=0;
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h2>당신이 선택한 항목입니다</h2>");
		out.print("<hr>");
		if(items==null) {
			out.print("<h3>선택한 항목이 없습니다</h3>");
		}
		else {
			for(String item : items) {
				out.print(" " + items[i]);
				i++;
			}
		}
		out.print("<br><a href='javascript:history.back()'>다시</a>");
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

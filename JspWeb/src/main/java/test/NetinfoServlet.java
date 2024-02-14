package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NetinfoServlet
 */
@WebServlet("/Netinfo")
public class NetinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NetinfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력</title></head>");
		out.print("<body>");
		out.print("<h3>Request 정보 출력</h3>");
		out.print("Request Scheme : " + req.getScheme() + "<br/>");
		out.print("Server name :" + req.getServerName() + "<br/>");
		out.print("Server Address : " +req.getLocalAddr() + "<br/>");
		out.print("Server Port : " +req.getServerPort()  + "<br/>");
		out.print("Client Address : " +req.getRemoteAddr() + "<br/>");
		out.print("Client Hoset :" +req.getRemoteHost()  + "<br/>");
		out.print("Client Port : " + req.getRemotePort() + "<br/>");
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

package test;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet{

//	FisrtServlet 은 디폴트 UID값을 갖고있어야함 , 고유ID이다
	private static final long serialVersionUID = 1L;
	
	public void init() {
		System.out.println("init");
	}
	public void service(ServletRequest request , ServletResponse response) {
		System.out.println("service");
		
	}
}

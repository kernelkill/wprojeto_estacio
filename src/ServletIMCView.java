
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletIMCView
 */
@WebServlet("/servletimcview")
public class ServletIMCView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletIMCView() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try{
		// TODO Auto-generated method stub
		
		Double peso = (Double) request.getAttribute("peso");
		Double altura = (Double) request.getAttribute("altura");
		Double imc = (Double) request.getAttribute("imc");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Calculo IMC usando ServletIMCView: Resultado </title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1> Imprimindo em ServletIMCView</h1>");
		
		out.println("<p> Peso: " + peso + "</p>");
		out.println("<p>Altura: " + altura + "</p>");
		out.println("<p> IMC: " + imc + "</p>");
		
		if (imc < 18.0) {
			out.println("<p> Cuidado! abaixo </p>");
		}else if( imc < 25.0){
			out.println("<p> Parabens! Peso ideal.");
		}else{
			out.println("<p>Cuidado! Acima</p>");
		}

		out.println("</body>");
		out.println("</html>");
		}catch(Exception e){
		}
	}
}

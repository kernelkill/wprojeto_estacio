
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletimc")
public class ServletIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {

			out.println("<html>");
			out.println("<head>");
			out.println("<title> Calculadora IMC: Resultado </title>");
			out.println("</head>");
			out.println("<body>");
			out.print("<h1>Indice de Massa corpora: </h1>");

			Double pesoT = Double.valueOf(request.getParameter("peso").replaceAll(",", "."));
			Double alturaT = Double.valueOf(request.getParameter("altura").replaceAll(",", "."));

			Double imc = pesoT / (alturaT * alturaT);

			out.println("<p> Peso: " + pesoT + "</p>");
			out.println("<p>Altura: " + alturaT + "</p>");
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
		} catch (Exception e) {
			
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Calculadora IMC: Resultado </title>");
			out.println("</head>");
			out.println("<body>");
			out.print("<h1>Digite numero e NÃO LETRA! </h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	//
	// public ServletIMC() {
	// super();
	// // TODO Auto-generated constructor stub
	// }
	//
	// public void init(ServletConfig config) throws ServletException {
	// // TODO Auto-generated method stub
	// }
	//
	// protected void doPost(HttpServletRequest request, HttpServletResponse
	// response)
	// throws ServletException, IOException {
	// // TODO Auto-generated method stub
	// }
}


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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


			Double pesoT = Double.valueOf(request.getParameter("peso").replaceAll(",", "."));
			Double alturaT = Double.valueOf(request.getParameter("altura").replaceAll(",", "."));

			Double imc = pesoT / (alturaT * alturaT);
			
			request.setAttribute("peso",pesoT);
			request.setAttribute("altura", alturaT);
			request.setAttribute("imc", imc);
			String msg = "";
			if(imc < 18.0 ){
				msg = "Voce esta abaixo do peso";
			}else if (imc < 25.00) {
				msg = "Voce forma Diego Paniago";
			}else {
				msg ="Fudeo amiigo";
			}
			
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("/imcview.jsp");
			rd.forward(request, response);
			return;

			
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
}

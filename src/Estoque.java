

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Estoque
 */
@WebServlet("/estoque")
public class Estoque extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Estoque() {
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
		    try {
		    	Class.forName("org.postgresql.Driver");
		    	Connection conexao = DriverManager.getConnection(
		    			"jdbc:postgresql://localhost/pssw", "postgres", "postgres");
				
		    	out.println("<h1> Concexão Realizada com Sucesso</h1>");
			} 
		    catch(Exception e){
		    	e.printStackTrace();
		    }
		    finally {
				out.close();
			}
	}

}

package es.curso.dispatchers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.controllers.ejb.ListarTarjetasControllerEjb;

/**
 * Servlet implementation class BancoServlet
 */
@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BancoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		String titulo = "Sin título";//ponemos "" para reinicializar y 
					//Sin título para que lo veamos pero podemos dejarlo vacio
		RequestDispatcher rd;
		switch(action){
		case "altaTarjeta"://se debe redirigir hacia el formulario altaCliente
				rd=request.getRequestDispatcher("/jsp/altaTarjeta.jsp");
				rd.forward(request, response);
				break;
			case "listarTarjetas"://se invocará al controlador adecuado que
								//obtendrá todos los clientes
								//esta petición redirije a otra página
				ListarTarjetasControllerEjb todos=new ListarTarjetasControllerEjb();
				ArrayList<Numero> numero= todos.listarTarjetas();
				request.setAttribute("numero", numero);
				titulo="Listado General de Tarjetas";
				rd = request.getRequestDispatcher("/jsp/listarTarjetas.jsp");
				rd.forward(request, response);
				break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher rd;
		switch(action){
		case "altaTarjetas":
			//recuperar los datos del formulario
			String numero=request.getParameter("numero");
			String cupoMaximo=request.getParameter("cupoMaximo");
			String cupoDisponible=request.getParameter("cupoDisponible");
			String tipo=request.getParameter("tipo");
			String numeroComprobacion=request.getParameter("numeroComprobacion");
			String contrasenha=request.getParameter("contrasenha");
			String bloqueada=request.getParameter("bloqueada");
			Numero numero=new Numero(0, numero, cupoMaximo, cupoDisponible, tipo, numeroComprobacion, contrasenha, bloqueada); 
			//se invocará al controlador adecuado
			DarAltaTarjetasControllerEjb controlador=new DarAltaTarjetasControllerEjb();
			controlador.agregar(numero);
			
			rd=request.getRequestDispatcher("../index.jsp");
			rd.forward(request, response);
			
			break;
	}

}

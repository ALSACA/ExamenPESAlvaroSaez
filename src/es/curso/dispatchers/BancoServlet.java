package es.curso.dispatchers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.controllers.ActualizarController;
import es.curso.controllers.ejb.DarAltaTarjetasControllerEjb;
import es.curso.controllers.ejb.ListarTarjetasControllerEjb;
import es.curso.model.entity.Numero;

/**
 * Servlet implementation class BancoServlet
 */
@WebServlet("/Banco/*")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BancoServlet() {
        super();
        
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
				ListarTarjetasControllerEjb tarjetas=new ListarTarjetasControllerEjb();
				ArrayList<Numero> numeros= tarjetas.listarTarjetas();
				request.setAttribute("numeros", numeros);
				titulo="Listado General de Tarjetas";
				rd = request.getRequestDispatcher("/jsp/listarTarjetas.jsp");
				rd.forward(request, response);
				break;
		default:
			rd = request.getRequestDispatcher("../index.jsp");
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
			int numero=Integer.parseInt(request.getParameter("numero"));
			String cupoMaximo=request.getParameter("cupoMaximo");
			String cupoDisponible=request.getParameter("cupoDisponible");
			String tipo=request.getParameter("tipo");
			String numeroComprobacion=request.getParameter("numeroComprobacion");
			String contrasenha=request.getParameter("contrasenha");
			String bloqueadaStr=request.getParameter("bloqueada");
			Boolean bloqueada=false;
			if(bloqueadaStr.equals("true")){
				bloqueada = true;
			}
			if(bloqueadaStr.equals("false")){
				bloqueada = false;
			}
			Numero numeros=new Numero(0, numero, cupoMaximo, cupoDisponible, tipo, numeroComprobacion, contrasenha, bloqueada); 
			//se invocará al controlador adecuado
			DarAltaTarjetasControllerEjb controlador=new DarAltaTarjetasControllerEjb();
			controlador.agregar(numeros);
			
			rd=request.getRequestDispatcher("../index.jsp");
			rd.forward(request, response);
			
			break;
		case "actualizar":
			int idNumero=Integer.parseInt(request.getParameter("id"));
			int numeroNumero=Integer.parseInt(request.getParameter("numero"));
			String cupoMaximoNumero=request.getParameter("cupoMaximo");
			String cupoDisponibleNumero=request.getParameter("cupoDisponible");
			String tipoNumero=request.getParameter("tipo");
			String numeroComprobacionNumero=request.getParameter("numeroComprobacion");
			String contrasenhaNumero=request.getParameter("contrasenha");
			String bloqueadaNumero=request.getParameter("bloqueada");
			Boolean bloqueada1=false;
			if(bloqueadaNumero.equals("true")){
				bloqueada1 = true;
			}
			if(bloqueadaNumero.equals("false")){
				bloqueada1 = false;
			}
			
			Numero numeroModif=new Numero(idNumero, numeroNumero, cupoMaximoNumero, cupoDisponibleNumero, tipoNumero, numeroComprobacionNumero, contrasenhaNumero, bloqueada1);
			//se invocará al controlador adecuado
			ActualizarController actualizarEjb=new ActualizarControllerEjb();
			actualizarEjb.actualizar(numeroModif);
			
			response.sendRedirect("listarTarjetas");
		
			break;	
		}
	}
}

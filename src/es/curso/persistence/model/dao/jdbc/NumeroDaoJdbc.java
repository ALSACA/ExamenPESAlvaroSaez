package es.curso.persistence.model.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import es.curso.model.entity.Numero;
import es.curso.persistence.model.dao.NumeroDao;

public class NumeroDaoJdbc implements NumeroDao{
	private Connection cx;
	public NumeroDaoJdbc(){
		super();
	}
	@Override
	public void create(Numero numero) {
		
		try {
			/*van las instrucciones
			 * para
			 * 1. conectar con la base de datos
			 */
			abrirConexion();
			 /* 2. preparar la sentencia -sql-para agregar*/
			PreparedStatement ps=cx.prepareStatement(
					"INSERT INTO TARJETAS VALUES(?,?,?,?,?,?,?,?)");
			//2.1.INSERTAR LOS DATOS DEL CLIENTE EN LAS INTERROGACIONES
			ps.setInt(1, 0);
			ps.setInt(2, numero.getNumero());
			ps.setString(3, numero.getCupoMaximo());
			ps.setString(4, numero.getCupoDisponible());
			ps.setString(5, numero.getTipo());
			ps.setString(6, numero.getNumeroComprobacion());
			ps.setString(7, numero.getContrasenha());
			ps.setBoolean(8, numero.getBloqueada());
			/* 3. ejecutar la sentencia -sql-
			 */
			ps.executeUpdate(); //=q dar al play en heidi
					//se usa executeUpdate() para las instrucciones
					//com: insert delete update
					//esta instrucción devuelve como resultadoi el nº
					//de registros o filas afectadas
			//3.1.hacer commit....
			cx.commit();
		} catch (SQLException e) {
			try {
				cx.rollback();//si falla se borralo realizado
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally{
			/* 4. cerrar la conexion */
			cerrarConexion();
		}
		/* 3. ejecutar la sentencia -sql- 
		 * 4. cerrar la conexión*/
		
	}
	@Override
	public ArrayList<Numero> findAll() {
		ArrayList<Numero> numeros=new ArrayList<Numero>();
		//1.abrir la conexión
		abrirConexion();
		 /* 2. preparar la sentencia -sql-para MOSTRAR*/
		try {
			PreparedStatement ps=cx.prepareStatement(
					"SELECT *FROM TARJETAS");
			
			/* 3. ejecutar la sentencia -sql-
			 */
			ResultSet consulta=ps.executeQuery();
			//3.1.traspasar los datos de la respuesta al ArrayList
			while(consulta.next()){
				Numero numeroTemporal=new Numero();
				//código para traspasar de ñalconsulta(ResultSet)
				//hacia clienteTemporal
				
				numeroTemporal.setId(consulta.getInt("id"));
				numeroTemporal.setNumero(consulta.getInt("numero"));
				numeroTemporal.setCupoMaximo(consulta.getString("cupoMaximo"));
				numeroTemporal.setCupoDisponible(consulta.getString("cupoDisponible"));
				numeroTemporal.setTipo(consulta.getString("tipo"));
				numeroTemporal.setNumeroComprobacion(consulta.getString("numeroComprobacion"));
				numeroTemporal.setContrasenha(consulta.getString("contrasenha"));
				numeroTemporal.setBloqueada(consulta.getBoolean("bloqueada"));
				numeros.add(numeroTemporal);
				}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			/* 4. cerrar la conexion */
			cerrarConexion();
		}
		return numeros;
	}
	private void abrirConexion() {
		try {
			//1.determinar y validar si tengo el driver o conector de mysql
			Class.forName("com.mysql.jdbc.Driver");
			//2.establecer la conexión
			cx=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Banco",
					"root",
					"root");
			//3.iniciar el autocommit en false para gestionar transacciones
			cx.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	private void cerrarConexion() {
		try {
			if(cx!=null){
			}
			cx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void update(Numero numero) {
		
		
		try {
			//1.establecer conexión
			abrirConexion();
			//2.preparar la sentencia sql parametrizada(las de ?)
			PreparedStatement ps=cx.prepareStatement("UPDATE TARJETAS SET numero=?, cupoMaximo=?, cupoDisponible=?, tipo=?, numeroComprobacion=?, contrasenha=?, bloqueada=? WHERE ID=?");				
			//2.1.especificar lo que va en ?
			
			ps.setInt(1, numero.getNumero());
			ps.setString(2, numero.getCupoMaximo());
			ps.setString(3, numero.getCupoDisponible());
			ps.setString(4, numero.getTipo());
			ps.setString(5, numero.getNumeroComprobacion());
			ps.setString(6, numero.getContrasenha());
			ps.setBoolean(7, numero.getBloqueada());
			ps.setInt(8, numero.getId());
						
			//3.ejecutar la query
			ps.executeUpdate();
			//3.1 hacer commit
			cx.commit();
			}
		catch (SQLException e) {
			try {
				cx.rollback();
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally{
					/* 4. cerrar la conexion */
					cerrarConexion();
					}	
					
	}
	@Override
	public void delete(Integer id) {
		try {
			//1.establecer conexión
			abrirConexion();
			//2.preparar la sentencia sql parametrizada(las de ?)
			PreparedStatement ps=cx.prepareStatement(
					"DELETE FROM TARJETAS WHERE ID=?");
			//2.1.especificar lo que va en ?
			ps.setInt(1,id);
			//3.ejecutar la query
			ps.executeUpdate();
			//3.1 se hace commit
			cx.commit();
		} 
		catch (SQLException e) {
			try {
				cx.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
				e.printStackTrace();
			}
			finally{
			/* 4. cerrar la conexion */
			cerrarConexion();
			}
		
	}
	@Override
	public ArrayList<Numero> searchByNumero(String cadenaNumero) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

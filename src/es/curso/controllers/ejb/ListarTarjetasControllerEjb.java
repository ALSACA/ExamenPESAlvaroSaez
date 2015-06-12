package es.curso.controllers.ejb;

import es.curso.controllers.ListarTarjetasController;
import es.curso.dispatchers.ArrayList;
import es.curso.dispatchers.Numero;
import es.curso.model.entity.Cliente;
import es.curso.persistence.model.dao.jdbc.ClienteDaoJdbc;

public class ListarTarjetasControllerEjb implements ListarTarjetasController{

	public ArrayList<Numero> listarTarjetas() {
		ClienteDaoJdbc daoNumero=new NumeroDaoJdbc();
		ArrayList<Numero> numero=daoNumero.findAll();
		//mas instrucciones
		//mas instrcucciones
		return numero;
	}

}

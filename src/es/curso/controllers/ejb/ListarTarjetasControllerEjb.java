package es.curso.controllers.ejb;

import java.util.ArrayList;

import es.curso.controllers.ListarTarjetasController;
import es.curso.model.entity.Numero;
import es.curso.persistence.model.dao.jdbc.NumeroDaoJdbc;


public class ListarTarjetasControllerEjb implements ListarTarjetasController{

	@Override
	public ArrayList<Numero> listarTarjetas() {
		NumeroDaoJdbc daoNumero=new NumeroDaoJdbc();
		ArrayList<Numero> numeros=daoNumero.findAll();
		//mas instrucciones
		//mas instrcucciones
		return numeros;
	}

}

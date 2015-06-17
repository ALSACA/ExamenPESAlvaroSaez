package es.curso.controllers.ejb;

import java.util.ArrayList;

import es.curso.controllers.BuscarPorNumeroController;
import es.curso.model.entity.Numero;
import es.curso.persistence.model.dao.NumeroDao;
import es.curso.persistence.model.dao.jdbc.NumeroDaoJdbc;

public class BuscarPorNumeroControllerEjb implements BuscarPorNumeroController{

	@Override
	public ArrayList<Numero> buscarPorNumero(String cadenaNumero) {
		NumeroDao numeroDao=new NumeroDaoJdbc();
		
		
		
		return numeroDao.searchByNumero(cadenaNumero);
		
	}

}

package es.curso.controllers.ejb;


import es.curso.controllers.DarAltaTarjetasController;
import es.curso.model.entity.Numero;
import es.curso.persistence.model.dao.NumeroDao;
import es.curso.persistence.model.dao.jdbc.NumeroDaoJdbc;


public class DarAltaTarjetasControllerEjb implements 
	DarAltaTarjetasController {
		private NumeroDao numeroDao;
	@Override
	public void agregar(Numero numero) {
		//logica para agregar un cliente
		/* 1. verificar datos
		 * 2. agregarlo--->llamart a DAO -- para que se dee Alta
		 * 3. enviar email al jefe 
		 * 4. enviar email cliente
		 * */
		numeroDao=new NumeroDaoJdbc();
		numeroDao.create(numero);
	
	}


}
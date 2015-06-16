package es.curso.dispatchers;

import es.curso.controllers.ActualizarController;
import es.curso.model.entity.Numero;
import es.curso.persistence.model.dao.NumeroDao;
import es.curso.persistence.model.dao.jdbc.NumeroDaoJdbc;



public class ActualizarControllerEjb implements ActualizarController {
	
	@Override
	public void actualizar(Numero numero){
		NumeroDao numeroDao=new NumeroDaoJdbc();
		numeroDao.update(numero);
		
	}

}

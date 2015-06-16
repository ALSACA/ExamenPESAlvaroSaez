package es.curso.controllers.ejb;

import es.curso.controllers.EliminarPorIdController;
import es.curso.persistence.model.dao.NumeroDao;
import es.curso.persistence.model.dao.jdbc.NumeroDaoJdbc;


public class EliminarPorIdControllerEjb implements EliminarPorIdController {

	@Override
	public void eliminarPorId(Integer id) {
		NumeroDao numeroDao=new NumeroDaoJdbc();
		// verificar si no tiene deudas
		numeroDao.delete(id);
		
	}
	
}

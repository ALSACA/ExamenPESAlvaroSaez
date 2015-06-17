package es.curso.persistence.model.dao;

import java.util.ArrayList;

import es.curso.model.entity.Numero;

public interface NumeroDao {
	public void create(Numero numero);
	public ArrayList<Numero> findAll();
	public void update(Numero numero);
	public void delete(Integer id);
	public ArrayList<Numero> searchByNumero(String cadenaNumero);
}

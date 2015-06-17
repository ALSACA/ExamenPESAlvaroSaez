package es.curso.controllers;

import java.util.ArrayList;

import es.curso.model.entity.Numero;

public interface BuscarPorNumeroController {

	public abstract ArrayList<Numero> buscarPorNumero(String cadenaNumero);

}

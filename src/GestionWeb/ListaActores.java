package GestionWeb;

import java.util.*;

public class ListaActores {

	private static ListaActores mListaActores = null;
	private HashMap<String, Actor> lista;
	
	private ListaActores() {
		lista = new HashMap<String, Actor>();
	}
	
	public static ListaActores getListaActores() {
		if(mListaActores == null) mListaActores = new ListaActores();
		return mListaActores;
	}
}

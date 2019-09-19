package GestionWeb;

import java.util.*;

public class ListaActores {

	private static ListaActores mListaActores = null;
	private ArrayList<Actor> lista;
	
	private ListaActores() {
		lista = new ArrayList<Actor>();
	}
	
	public static ListaActores getListaActores() {
		if(mListaActores == null) mListaActores = new ListaActores();
		return mListaActores;
	}
}

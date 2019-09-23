package GestionWeb;

import java.util.*;

public class ListaPeliculas {

	private static ListaPeliculas mListaPeliculas = null;
	private HashMap<String, Pelicula> lista;
	
	private ListaPeliculas() {
		lista = new HashMap<String, Pelicula>();
	}
	
	public static ListaPeliculas getListaPeliculas() {
		if(mListaPeliculas == null) mListaPeliculas = new ListaPeliculas();
		return mListaPeliculas;
	}
	
}

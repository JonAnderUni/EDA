package GestionWeb;

import java.util.*;

public class ListaPeliculas {

	private static ListaPeliculas mListaPeliculas = null;
	private ArrayList<Pelicula> lista;
	
	private ListaPeliculas() {
		lista = new ArrayList<Pelicula>();
	}
	
	public static ListaPeliculas getListaPeliculas() {
		if(mListaPeliculas == null) mListaPeliculas = new ListaPeliculas();
		return mListaPeliculas;
	}
	
}

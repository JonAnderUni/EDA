package GestionWeb;

import java.util.*;
import java.io.*;

public class ListaPeliculas {

	private static ListaPeliculas mListaPeliculas = null;
	private HashMap<String, Pelicula> lista;

	private ListaPeliculas() {
		lista = new HashMap<String, Pelicula>();
	}

	public static ListaPeliculas getListaPeliculas() {
		if (mListaPeliculas == null)
			mListaPeliculas = new ListaPeliculas();
		return mListaPeliculas;
	}

	public HashMap<String, Pelicula> getHash() {

		return lista;

	}

}

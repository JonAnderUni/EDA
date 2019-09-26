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
	public HashMap<String, Actor> getHash(){
		return lista;
	}
	public Actor buscarActor(String a) {
		return lista.get(a);
	}
	public void addListaActorGeneral(HashMap<String, Actor> h) {
		lista.putAll(h);
	}
	public void addActorGeneral(Actor a) {
		lista.put(a.getNombre(), a);
	}
}
	

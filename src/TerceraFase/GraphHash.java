package TerceraFase;
import java.util.*;

import GestionWeb.Actor;
import GestionWeb.ListaActores;
import GestionWeb.ListaPeliculas;
import GestionWeb.Pelicula;
import GestionWeb.GestionWeb;

public class GraphHash {
	HashMap<String, ArrayList<String>> g;
	HashMap<String, ArrayList<String>> g2;
	GestionWeb gw = new GestionWeb();
	
	
	public void crearGrafo(ListaActores la) {
		gw.cargarDatos();
		
		for (Actor i : gw.ordenarActoresGeneral()) {
			g.put(i.nombre, gw.pelisDeActor2(i));
			for (Pelicula j : gw.pelisDeActor(i)) {
				if(g2.containsKey(j.getTitulo())) {				
				}else {
					g2.put(j.getTitulo(), gw.actoresDePeli(j.getTitulo()));
				}
			}
			
		}
		
	}
	
	public void print() {
		int i = 1;
		for(String s: g.keySet()) {
			System.out.println("Element: " + i++ +" " + s + " --> ");
			for(String k: g.get(s)) {
				System.out.println(k + " ### ");
			}
			System.out.println();
		}
	}
	public boolean estanConectados(String a1, String a2) {
		Boolean enc = false;
		ArrayList<String> comprobados = new ArrayList<String>();
		Queue<String> porComprobar = new LinkedList<String>();
		porComprobar.offer(a1);
		String aux;
		while((porComprobar.isEmpty() == false) && enc == false) {
			aux = porComprobar.poll();
			comprobados.add(a1);
			if(aux == a2) {
				enc = true;
			}else {
				for (String i : g.get(a1)) {
					//
					if(comprobados.contains(i)) {
						
					}else {
						porComprobar.offer(i);
					}
				}
			}
		}
		return enc;
	}
}
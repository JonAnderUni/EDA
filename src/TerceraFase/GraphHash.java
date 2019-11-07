package TerceraFase;
import java.util.*;

import GestionWeb.Actor;
import GestionWeb.ListaActores;
import GestionWeb.ListaPeliculas;
import GestionWeb.Pelicula;
import GestionWeb.GestionWeb;

public class GraphHash {
	HashMap<String, ArrayList<String>> g;//actor, pelis
	HashMap<String, ArrayList<String>> g2;//peli, actores
	GestionWeb gw = new GestionWeb();
	
 void crearGrafo( ) {
//>>>>>>> branch 'master' of https://github.com/JonAnderUni/EDA
		
		for (Actor i : gw.ordenarActoresGeneral()) {
			g.put(i.nombre, gw.pelisDeActor2(i));
			for (Pelicula j : gw.pelisDeActor(i)) {
				if(g2.containsKey(j.getTitulo())) {				
				}else {
					g2.put(j.getTitulo(), gw.actoresDePeli2(j.getTitulo()));
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
//<<<<<<< HEAD
		ArrayList<String> PelisComprobados = new ArrayList<String>();
		Queue<String> PelisporComprobar = new LinkedList<String>();
		g.get(a1).stream().forEach((p) -> PelisporComprobar.offer(p));
		//PelisporComprobar.offer(a1);
		String aux;
		while((PelisporComprobar.isEmpty() == false) && enc == false) {
			aux = PelisporComprobar.poll();
			PelisComprobados.add(aux);
			if(g2.get(aux).contains(a2)) {
				enc = true;
			}else {
				g2.get(aux).stream().forEach((p) -> g.get(p).forEach((p2) -> {
					if(PelisComprobados.contains(p2) == false) {
						PelisporComprobar.offer(p2);
					}
				}));
				/*for (String i : g2.get(aux)) {
					for (String j : g.get(i)) {
						if(PelisComprobados.contains(j)) {
							
						}else {
							PelisporComprobar.offer(j);
						}
					}
				}*/
//=======
		
//>>>>>>> branch 'master' of https://github.com/JonAnderUni/EDA
			}
		}
		return enc;
	}
}
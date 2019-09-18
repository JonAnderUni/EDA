package GestionWeb;

import java.util.*;

public class GestionWeb {

	public ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
	public ArrayList<Actor> actoresGeneral = new ArrayList<Actor>();
	
	public GestionWeb() {}
	
	public void addPelicula(Pelicula a) {
		pelis.add(a);
	}
	public void addListaPeliculas(ArrayList<Pelicula> a) {
		pelis.addAll(a);
	}
	public void addActorGeneral(Actor a) {
		actoresGeneral.add(a);
	}
	public void addListaActorGeneral(ArrayList<Actor> a) {
		for (Actor b: a) {
			actoresGeneral.add(b);
		}
	}
	public boolean esPrimerString(String a,  String b) {
		int comparar = a.compareTo(b);
		if(comparar < 1) {
			return true;
		}else {
			return false;
		}
	}
	public void quicksort(ArrayList<Actor> AG, int c1, int c2) {
		if(AG.isEmpty()) {	
		}else {
			Actor pivote = AG.get(c1);
			int i = c1;
			int izq = i;
			int j = c2;
			int der = j;
			Actor aux;
			
			while(i<j) {
				while(esPrimerString(AG.get(i).nombre, pivote.nombre)) {i++;}
				while(esPrimerString(pivote.nombre, AG.get(j).nombre)) {j--;}
				if(i<j) {
					aux = AG.get(i);
					AG.add(i, AG.get(j));
					AG.add(j, aux);
				}
			}
			AG.add(1, AG.get(j));
			AG.add(j, pivote);
			if(1<j-1) {quicksort(AG, izq, j-1);}
			if(j+1<AG.size()) {quicksort(AG, j+1, der);}
		}
	}
	public void ordenarActoresGeneral() {
		quicksort(actoresGeneral, 0, actoresGeneral.size()-1);
	}

	public void buscarActor(String n, String a) {
		Actor act = new Actor(n, a);
		int aux = binarysearch(act, actoresGeneral);
		if(aux == -1) {
			System.out.println("actor no encontrado1");
		}else {
			System.out.println("actor encontrado en la posicion "+aux+"del arraylist");
		}
	}
	public int binarysearch(Actor a, ArrayList<Actor> AG) {
		boolean encontrado = false;
		int i = 0;
		int j = AG.size()-1;
		int pos = -1;
		int medio;
		
		while (encontrado == false && i <= j) {
			medio = Math.floorDiv(i+j, 2);
			if (AG.get(medio).equals(a)) {
				encontrado = true;
			}else if (esPrimerString(AG.get(medio).nombre, a.nombre) == false){
				j = medio - 1;
			}else {
				i = medio +1;
			}
		}
		return pos;
	}
	
}

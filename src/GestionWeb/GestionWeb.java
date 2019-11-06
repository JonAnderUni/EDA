package GestionWeb;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GestionWeb {

	
	public GestionWeb() {
	}

	public void addPelicula(Pelicula a) {
		ListaPeliculas.getListaPeliculas().getHash().put(a.getTitulo(), a);
	}

	public void addListaPeliculas(HashMap<String, Pelicula> h) {
		ListaPeliculas.getListaPeliculas().addListaPeliculas(h);
	}

	public void addActorGeneral(Actor a) {
		ListaActores.getListaActores().addActorGeneral(a);
	}

	public void addListaActorGeneral(HashMap<String, Actor> h) {
		ListaActores.getListaActores().getHash().putAll(h);
	}

	public boolean esPrimerString(String a, String b) {
		int comparar = a.compareTo(b);
		if (comparar < 1) {
			return true;
		} else {
			return false;
		}
	}

	public Actor buscarActor(String a) {
		return ListaActores.getListaActores().buscarActor(a);
	}

	public Pelicula buscarPeli(String a) {
		return ListaPeliculas.getListaPeliculas().buscarPeli(a);
	}

	public ArrayList<Actor> actoresDePeli(String a) {
		return buscarPeli(a).getListaActor();
	}
	
	public ArrayList<String> actoresDePeli2(String a) {
		ArrayList<String> p = new ArrayList<String>();
		p = (ArrayList<String>) buscarPeli(a).getListaActor().stream().map(Actor :: getNombre).collect(Collectors.toList());
		return p;
	}

	public ArrayList<Pelicula> pelisDeActor(Actor a) {
		ArrayList<Pelicula> lista = new ArrayList<Pelicula>();
		for (Entry<String, Pelicula> p : ListaPeliculas.getListaPeliculas().getHash().entrySet()) {
			if (p.getValue().getListaActor().contains(a)) {
				lista.add(p.getValue());
			}
		}
		return lista;
	}
	
	public ArrayList<String> pelisDeActor2(Actor a) {
		ArrayList<String> lista = new ArrayList<String>();
		for (Entry<String, Pelicula> p : ListaPeliculas.getListaPeliculas().getHash().entrySet()) {
			if (p.getValue().getListaActor().contains(a)) {
				lista.add(p.getValue().getTitulo());
			}
		}
		return lista;
	}

	private void quicksort(ArrayList<Actor> AG, int c1, int c2) {
		if (AG.isEmpty()) {
		} else {
			Actor pivote = AG.get(c1);
			int i = c1;
			int izq = i;
			int j = c2;
			int der = j;
			Actor aux;

			while (i < j) {
				while (esPrimerString(AG.get(i).nombre, pivote.nombre)) {
					i++;
				}
				while (esPrimerString(pivote.nombre, AG.get(j).nombre)) {
					j--;
				}
				if (i < j) {
					aux = AG.get(i);
					AG.add(i, AG.get(j));
					AG.add(j, aux);
				}
			}
			AG.add(1, AG.get(j));
			AG.add(j, pivote);
			if (1 < j - 1) {
				quicksort(AG, izq, j - 1);
			}
			if (j + 1 < AG.size()) {
				quicksort(AG, j + 1, der);
			}
		}
	}

	public ArrayList<Actor> ordenarActoresGeneral() {
		ArrayList<Actor> actoresGeneral = new ArrayList<Actor>();
		actoresGeneral = (ArrayList<Actor>) ListaActores.getListaActores().getHash().values();
		quicksort(actoresGeneral, 0, actoresGeneral.size() - 1);
		return actoresGeneral;
	}
	
	

	public void borrarActor(Actor a) {
		for (Pelicula p : pelisDeActor(a)) {
			ListaPeliculas.getListaPeliculas().getHash().get(p.getTitulo()).getListaActor().remove(a);
		}
		ListaActores.getListaActores().getHash().remove(a.nombre);
	}

	public void cargarDatos() {
		
		try {
			BufferedReader entrada = new BufferedReader(new FileReader("FilmsActors20162017.txt"));
			String line = null;
			while ((line = entrada.readLine()) != null) {
				String[] separarPeli = line.split(" ---> ");
				ListaPeliculas.getListaPeliculas().getHash().put(separarPeli[0],
						new Pelicula(separarPeli[0], new ArrayList<Actor>()));
				String[] separarActores = separarPeli[1].split(" &&& ");
				for (int i = 0; i < separarActores.length; i++) {
					if (ListaActores.getListaActores().getHash().containsKey(separarActores[i])) {
						ListaPeliculas.getListaPeliculas().getHash().get(separarPeli[0])
								.addActor(ListaActores.getListaActores().getHash().get(separarActores[i]));
					} else {
						ListaPeliculas.getListaPeliculas().getHash().get(separarPeli[0])
								.addActor(new Actor(separarActores[i]));
						ListaActores.getListaActores().getHash().put(separarActores[i], new Actor(separarActores[i]));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public void buscarActor(String n, String a) { Actor act = new Actor(n, a);
	 * int aux = binarysearch(act, actoresGeneral); if(aux == -1) {
	 * System.out.println("actor no encontrado1"); }else {
	 * System.out.println("actor encontrado en la posicion "+aux+"del arraylist"); }
	 * }
	 */
	/*
	 * public int binarysearch(Actor a, ArrayList<Actor> AG) { boolean encontrado =
	 * false; int i = 0; int j = AG.size()-1; int pos = -1; int medio;
	 * 
	 * while (encontrado == false && i <= j) { medio = Math.floorDiv(i+j, 2); if
	 * (AG.get(medio).equals(a)) { encontrado = true; }else if
	 * (esPrimerString(AG.get(medio).nombre, a.nombre) == false){ j = medio - 1;
	 * }else { i = medio +1; } } return pos; }
	 */

	/*
	 * public static void main(String[] args) { cargarDatos(); }
	 */
}

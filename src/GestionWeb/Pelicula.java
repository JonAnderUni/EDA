package GestionWeb;
import java.util.*;

public class Pelicula {

		public String titulo;
		public ArrayList<Actor> actores = new ArrayList<Actor>();
		
		
		public Pelicula() {
		}
		public  Pelicula(String a, ArrayList<Actor> b) {
			titulo = a;
			actores = b;
		}
		
		public void setTitulo(String a) {
			titulo = a;
		}
		
		public void setActores(ArrayList<Actor> a) {
			actores = a;
		}
		
		public void addActor(Actor a) {
			actores.add(a);
		}
		
		public void addListaActores(ArrayList<Actor> a) {
			for (Actor p: a) {
				actores.add(p);
			}
		}
}

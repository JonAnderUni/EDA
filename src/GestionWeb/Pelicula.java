package GestionWeb;
import java.util.*;

public class Pelicula {

		private String titulo;
		private ArrayList<Actor> actores = new ArrayList<Actor>();
		private int recaudado;
		
		
		public  Pelicula(String a, ArrayList<Actor> b) {
			titulo = a;
			actores = b;
		}
		
		public String getTitulo() {
			return titulo;
		}
		
		public ArrayList<Actor> getListaActor(){
			return actores;
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
		public void setRecaudado(int a) {
			recaudado = a;
		}
		public void incrementarRecaudado(int a) {
			recaudado = recaudado + a;
		}
}

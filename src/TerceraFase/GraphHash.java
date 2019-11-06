package TerceraFase;
import java.util.*;

public class GraphHash {
	HashMap<String, ArrayList<String>> g;
	
	public void crearGrafo( ) {
		
		
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
				}
			}
		}
		return enc;
	}
}

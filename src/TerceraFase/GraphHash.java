package TerceraFase;
import java.util.*;

public class GraphHash {
	HashMap<String, ArrayList<String>> g;
	
	public void crearGrafo(ListaActricesAtcores lActores) {
		
		
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
		String comprobados[];
		return false;
	}
}

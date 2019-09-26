package GestionWeb;
public class Actor {

	private String nombre;
	//public String apellido;
	
	
	public Actor(String a, String b) {
		nombre = a;
		//apellido =b;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String a) {
		nombre = a;
	}
	/*public  void setApellido(String a) {
		apellido = a;
	}*/
}

package GestionWeb;
public class Actor {

	public String nombre;
	public String apellido;
	
	public Actor() {}
	public Actor(String a, String b) {
		nombre = a;
		apellido =b;
	}
	public void setNombre(String a) {
		nombre = a;
	}
	public void setApellido(String a) {
		apellido = a;
	}
}

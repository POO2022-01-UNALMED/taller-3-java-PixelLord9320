package taller3.televisores;

public class Marca {
	private String nombre;
	
	public Marca(String nombre) { // Constructor marca
		this.nombre = nombre;
	}
	
	public String getNombre () { // metodo GET
		return nombre;
	}
	
	public void setNombre (String Mnombre) { // metodo SET
		nombre = Mnombre;
	}
	
}

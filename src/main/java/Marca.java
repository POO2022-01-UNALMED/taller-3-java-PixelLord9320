package taller3.televisores;

public class Marca {
	private String nombre;
	
	//constructor
	public Marca(String nombre){
		this.nombre = nombre;
	}
	//metodos get set
	String getMarca() {
		return nombre;
	}
	void setMarca(String nombre) {
		this.nombre = nombre;
	}
}

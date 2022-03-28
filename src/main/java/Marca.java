package taller3.televisores;

public class Marca {
	private Marca nombre;
	
	//constructor
	public Marca(Marca nombre){
		this.nombre = nombre;
	}
	//metodos get set
	Marca getMarca() {
		return nombre;
	}
	void setMarca(Marca nombre) {
		this.nombre = nombre;
	}
}

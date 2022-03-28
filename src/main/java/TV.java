package taller3.televisores;

public class TV {
	Marca marca;
	private Control control;
	private int canal=1;
	private int precio=500;
	private int volumen=1;
	private boolean estado;
	private static int numTV=0;
	
	//constructor tv
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	//metodos set
	public void setPrecio(int precio) {
		this.precio =precio;
	}
	
	public void setVolumen(int volumen) {
		if(estado==true) {
			if(volumen >=0 && volumen <=7) {
				this.volumen =volumen;
			}
		}
	}
	public void setCanal(int canal) {
		if(estado==true) {
			if(canal >=1 && canal <=120) {
				this.canal =canal;
			}
		}
	}
	
	public void setNumTV(int num) {
		numTV= num;
	}
	
	public void canalUp() {
		if(estado==true) {
			if(this.canal>=1 && this.canal<120) {
				this.canal++;
			}
		}
	}
	
	public void canalDown() {
		if(estado==true) {
			if(this.canal>1 && this.canal<=120) {
				this.canal--;
			}
		}
	}
	
	public void volumenUp() {
		if(estado==true) {
			if(this.volumen>=0 && this.volumen<7) {
				this.volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if(estado==true) {
			if(this.volumen>0 && this.volumen<=7) {
				this.volumen--;
			}
		}
	}
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setMarca(String marca) {
		this.marca = new Marca(marca);
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void turnOn() {
		this.estado =true;
	}
	
	//metodos get
	public int getPrecio() {
		return this.precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
}

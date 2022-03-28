package taller3.televisores;


public class TV {
	private Marca marca;
	private int canal=1;
	private int precio = 500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	public static int numTV=0;
	
	public TV(Marca marca, boolean estado) { 
		 this.marca = new Marca(marca.getNombre());
		 this.estado = estado;	
		 numTV++;
	}
	
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if(this.estado == true) {
		if(this.canal >= 1 && this.canal < 120) {
			this.canal+=1;
			}	
		}
	}
	
	public void canalDown() {
		if(this.estado == true) {
		if(this.canal > 1 && this.canal <= 120) {
			this.canal-=1;
			}	
		}
	}
	
	public void volumenUp() {
		if(this.estado == true) {
		if(this.volumen >=0 && this.volumen <7) {
			this.volumen+=1;
			}
		}
	}
	
	public void volumendow() {
		if(this.estado == true) {
		if(this.volumen >1 && this.volumen <=7) {
			this.volumen-=1;
			}
		}
	}
	
	
	public void setMarca(String marca) { 
		this.marca.setNombre(marca);
	}
	
	public void setControl(Control control) { 
		this.control = control;
	}
	
	public void setPrecio(int precio) { 
		this.precio = precio;
	}
	
	public  void setVolumen(int volumen) { 
		if(volumen>=0 && volumen <= 7) {
			this.volumen = volumen;
		}
	}
	
	public void setCanal(int canal) { 
		if(this.estado == true) {
			if(canal >= 1 && canal <= 120) {
				this.canal = canal;
			}
		}
	}
	public void setNumTV() {
		TV.numTV = 0;
	}
	
	
	public String getMarca() {
		return this.marca.getNombre();
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	public static int getNumTV() {
		return numTV;
	}
	
	
	
	

}

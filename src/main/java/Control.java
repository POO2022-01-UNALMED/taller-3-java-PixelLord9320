package taller3.televisores;

public class Control {
	private  TV tv;
	
	//metodos set get 
	void setTV(TV tv) {
		this.tv = tv;
	}
	TV getTV() {
		return tv;
	}
	
	void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}
}

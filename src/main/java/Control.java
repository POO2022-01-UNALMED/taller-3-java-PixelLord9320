package taller3.televisores;

public class Control {
	 TV tv;
	
	//metodos set get 
	public void setTV(TV tv) {
		this.tv = tv;
	}
	public TV getTV() {
		return tv;
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
	}
}

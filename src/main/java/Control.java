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
	public void turnOff() {
		this.tv.turnOff();
	}
	public void turnOn() {
		this.tv.turnOn();
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void canalDown() {
		this.tv.canalDown();
	}
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
}

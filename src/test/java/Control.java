package taller3.televisores;


public class Control {
	private TV tv;
	
	public TV getTV() {
		return this.tv;
	}
	public void setTV(TV tv) {
		this.tv = tv;
	}
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}

}


public class Surubiii {
	private String nombre;
	private String alimentacion;
	private double peso;
	private String localizacion;
	private int tamaño;
	private boolean peligroso;
	
	public void presentacion() {
	this.peso= 10.00;
	this.nombre= "surubi";
	this.alimentacion= "mojarra";
	this.peligroso=true;
	this.tamaño=170;
	this.localizacion= "peru";
	
	System.out.println("Hola soy un" +this.nombre+this.alimentacion+ this.peso+ this.localizacion+ this.tamaño+ this.peligroso );
	////
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public boolean isPeligroso() {
		return peligroso;
	}
	public void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}
	
	
}




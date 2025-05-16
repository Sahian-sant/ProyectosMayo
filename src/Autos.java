
public class Autos {
	//Atributo del objeto
	//Declarar nuestra variable 
	//Sintaxis para declara las variables 
	//ModificadorDeAcceso TipoDeDatos nombreVariable
	
	String marca;
	String modelo;
	String color;
	int anio;
	double precio;
	
	//constructor vacio-- para realizar la instancia de clases
	public Autos () {
	}
// constructor con todos los parametros
	//sobrecarga
	public Autos(String marca, String modelo, String color, int anio, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.precio = precio;
		
	}
	
	
	//toString --te convierte un objeto a cadena
	@Override //aqui se esta sobreescribiendo el metodo
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anio=" + anio + ", precio="
				+ precio + "]";
	}
	//Encapsulamiento
	//metodos:Funciones(retorno) y procedimientos(no tiene retorno)
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}

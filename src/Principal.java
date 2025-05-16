
public class Principal {

	//main es el punto de entrada principla
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancia de clase el constructor vacio
		//como crear un objeto en java :NombreClase nombreObjeto= new constructor
		Autos auto =new Autos();
		
		//asignacion de Valores
		auto.marca="Toyota";
		auto.modelo="Tacoma";
		auto.anio= 2015;
		auto.color="rojo";
		auto.precio=222345;
		
		//mostrar ese objeto con sus atributos
		System.out.println("Datos del primer auto");
		System.out.println("Marca "+auto.marca);
		System.out.println(" Modelo "+auto.modelo);
		System.out.println(" Anio "+auto.anio);
		System.out.println(" color "+auto.color);
		System.out.println(" Precio "+auto.precio);
		
		//instancia de clase el constructor vacio
		Autos auto2=new Autos();
		
		//Encasulamineto
		//asignacion de valores ---set (enviar)
		
		auto2.setMarca("Nissan");
		auto2.setModelo("Versa");
		auto2.setColor("Rojo");
		auto2.setAnio(2022);
		auto2.setPrecio(123456);
		
		System.out.println("Datos del auto2");
		System.out.println("Marca " +auto2.marca);
		System.out.println("Modelo "+auto2.modelo);
		System.out.println("Anio "+auto2.anio);
		System.out.println("color "+auto2.color);
		System.out.println("Precio "+auto2.precio);
		

		
		//instancia de clase con el constructor con todos los parametros
		Autos auto3=new Autos(" Chvrolet "," TRACKER "," Rojo ", 2024 , 250000);
		System.out.println("Datos del auto 3");
		System.out.println(auto3);
		
		
		//realizar un nuevo proyecto
		//proyectoLibreria
		//clase libros
		  //atributos:clave,titulo,autor,precio
		//constructor vacio
		//constructor con parametros(clave,titulo,precio)
		//metodo tostring
		//encapsulamiento
		//clase con elmetodo main
		//realizar la instancia de clase con el constructor de vacio y asignacion de variables publicas
		
		

	}
	

}

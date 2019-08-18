
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeropuerto aero1 = new Aeropuerto("Rodriguez Ballón","Arequipa",1);
		aero1.Imprimir(); 
		Aviones a1 = new Aviones();
		a1.Imprimir();
		Vuelos vu = new Vuelos();
		//IMPRIMIR LISTADO DE PILOTOS
		vu.ImprimirPiloto("1501");
		//IMPRIMIR LISTADO DE PASAJEROS
		vu.ImprimirPasajeros();
		
	
	
		
		
	}

}

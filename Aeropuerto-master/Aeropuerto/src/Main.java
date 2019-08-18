
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeropuerto aero1 = new Aeropuerto("Rodriguez Ballón","Arequipa",1);
		aero1.Imprimir(); 
		
		Vuelos vu = new Vuelos();
		//IMPRIMIR AVION
		vu.ImprimirAvion("XHG-589-PE");
		//IMPRIMIR LISTADO DE PILOTOS
		vu.ImprimirPiloto("1501");
		//IMPRIMIR LISTADO DE PASAJEROS
		vu.ImprimirPasajeros();
		
	
	
		
		
	}

}

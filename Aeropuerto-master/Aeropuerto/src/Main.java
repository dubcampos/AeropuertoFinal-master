import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Aeropuerto> lista_aeropuertos= new ArrayList <Aeropuerto>();
		Aeropuerto aero0 = new Aeropuerto();
		Aeropuerto aero1 = new Aeropuerto("Aeropuerto Internacional Rodriguez Ballon","Arequipa","PE-AQP",aero0.getLista_vuelos());
		Aeropuerto aero2 = new Aeropuerto("Aeropuerto Internacional Jorge Chavez","Lima","PE-LIM",aero0.getLista_vuelos());
		Aeropuerto aero3 = new Aeropuerto("Aeropuerto Internacional Velazco Astete","Cusco","PE-CUS",aero0.getLista_vuelos());
		Aeropuerto aero4 = new Aeropuerto("Aeropuerto Guillermo Concha Iberico","Piura","PE-PIU",aero0.getLista_vuelos());
		Aeropuerto aero5 = new Aeropuerto("Aeropuerto Internacional de Chiclayo","Chiclayo","PE-CIX",aero0.getLista_vuelos());
		Aeropuerto aero6 = new Aeropuerto("Aeropuerto Internacional Francisco Secada","Iquitos","PE-IQT",aero0.getLista_vuelos());
		lista_aeropuertos.add(aero1);
		lista_aeropuertos.add(aero2);
		lista_aeropuertos.add(aero3);
		lista_aeropuertos.add(aero4);
		lista_aeropuertos.add(aero5);
		lista_aeropuertos.add(aero6);
		
		for (Aeropuerto aeropuerto : lista_aeropuertos) {
			aeropuerto.ImprimirVuelos("Lima");
		}
		
		
		
		
	
	
		
		
	}

}

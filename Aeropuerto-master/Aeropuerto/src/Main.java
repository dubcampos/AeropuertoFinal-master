import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Aeropuerto> lista_aeropuertos= new ArrayList <Aeropuerto>();
		Aeropuerto aero0 = new Aeropuerto();
		Aeropuerto aero1 = new Aeropuerto("Arequipa","Arequipa","AQP",aero0.getLista_vuelos());
		lista_aeropuertos.add(aero1);
		
		aero1.Imprimir(); 
		
		
		
	
	
		
		
	}

}

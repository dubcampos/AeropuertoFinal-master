import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
	
	
	//ATRIBUTOS
	private String nombre;
	private String ciudad;
	private String id_aeropuerto;
	private List<Vuelos> lista_vuelos = new ArrayList <Vuelos>();
	
	
	//CONTRUCTORES
	public Aeropuerto(String nombre, String ciudad, String id_aeropuerto, List<Vuelos> lista_vuelos) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.id_aeropuerto = id_aeropuerto;
		this.lista_vuelos = lista_vuelos;
	}
	
	public Aeropuerto() {	
		this.nombre = "Aeropuerto";
		this.ciudad = "Ciudad";
		this.id_aeropuerto = "NONE";
		this.lista_vuelos = new ArrayList<Vuelos>();
	}
	
	//GETTER & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getId_aeropueto() {
		return id_aeropuerto;
	}

	public void setId_aeropueto(String id_aeropuerto) {
		this.id_aeropuerto = id_aeropuerto;
	}
	
	public String getId_aeropuerto() {
		return id_aeropuerto;
	}

	public void setId_aeropuerto(String id_aeropuerto) {
		this.id_aeropuerto = id_aeropuerto;
	}

	public List<Vuelos> getLista_vuelos() {
		return lista_vuelos;
	}

	public void setLista_vuelos(List<Vuelos> lista_vuelos) {
		this.lista_vuelos = lista_vuelos;
	}

	
	//METODOS
	
	
	public void GenerarVuelos() {
		Vuelos vu = new Vuelos();
		
		Vuelos vuelo1 = new Vuelos("9:00","Arequipa","Lima",false,vu.getLista_pasajeros(),vu.getLista_pilotos(),vu.getLista_aviones());
		lista_vuelos.add(vuelo1);	
	}
	
	public void ImprimirVuelos(String ciudad) {
		GenerarVuelos();
		if(ciudad == getCiudad()) {
			System.out.println("============================");
			System.out.println("Aeropuerto: "+getNombre());
			System.out.println("Ciudad: "+getCiudad());
			System.out.println("ID Aeropuerto: "+getId_aeropueto());
			System.out.println("============================");
			
			Vuelos vu = new Vuelos();
			//IMPRIMIR VUELO
			vu.Imprimir();
		}
	}
	
	
	
	
	
	

}

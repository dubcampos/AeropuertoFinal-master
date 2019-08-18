
public class Aeropuerto {
	
	
	//ATRIBUTOS
	private String nombre;
	private String ciudad;
	private int numero_pistas;
	
	
	//CONTRUCTORES
	public Aeropuerto(String nombre, String ciudad, int numero_pistas) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numero_pistas = numero_pistas;
	}
	
	public Aeropuerto() {	
		this.nombre = "Aeropuerto";
		this.ciudad = "Ciudad";
		this.numero_pistas = 1;
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

	public int getNumero_pistas() {
		return numero_pistas;
	}

	public void setNumero_pistas(int numero_pistas) {
		this.numero_pistas = numero_pistas;
	}
	
	
	//METODOS
	
	public void Imprimir() {
		System.out.println("============================");
		System.out.println("Aeropuerto: "+getNombre());
		System.out.println("Ciudad: "+getCiudad());
		System.out.println("============================");
	}
	
	
	
	

}

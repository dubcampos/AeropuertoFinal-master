
public class Aviones {
	
	//	ATRIBUTOS
	
	private String matricula;
	private String marca;
	private String modelo;
	private int capacidad_tripulacion;
	private int capacidad_pasajeros;
	
	
	//CONTRUCTORES
	public Aviones( String matricula, String marca, String modelo, int capacidad_tripulacion, int capacidad_pasajeros) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad_tripulacion = capacidad_tripulacion;
		this.capacidad_pasajeros = capacidad_pasajeros;
	}
	
	public Aviones() {
		
		this.matricula = "XX-XXX";
		this.marca = "Marca";
		this.modelo = "Modelo";
		this.capacidad_tripulacion = 1;
		this.capacidad_pasajeros = 1;
	}
	
	
	//GETTERS & SETTERS

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

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

	public int getCapacidad_tripulacion() {
		return capacidad_tripulacion;
	}

	public void setCapacidad_tripulacion(int capacidad_tripulacion) {
		this.capacidad_tripulacion = capacidad_tripulacion;
	}

	public int getCapacidad_pasajeros() {
		return capacidad_pasajeros;
	}

	public void setCapacidad_pasajeros(int capacidad_pasajeros) {
		this.capacidad_pasajeros = capacidad_pasajeros;
	}
	
	public void Imprimir() {
		System.out.println("===========AVION============");
		System.out.println(getMarca()+" - "+getModelo() + " - "+ getMatricula());		
		System.out.println("============================");
	}
	
	

}

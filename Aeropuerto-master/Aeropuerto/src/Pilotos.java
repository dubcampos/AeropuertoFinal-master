public class Pilotos extends Personas{
	
	//ATRIBUTOS
	private String id_piloto;
	
	
	//CONTRUCTORES
	public Pilotos(String nombre, int edad, char sexo, String documento, String id_piloto) {
		super(nombre, edad, sexo, documento);
		this.id_piloto= id_piloto;
	}
	public Pilotos () {
		this.id_piloto = "0000";
	}
	
	//GETTERS & SETTERS
	public String getId_piloto() {
		return id_piloto;
	}
	public void setId_piloto(String id_piloto) {
		this.id_piloto = id_piloto;
	}
	
	
	//METODOS
	
	
	public void Imprimir() {
		System.out.println("==========PILOTO==========");
		System.out.println("ID Piloto: "+getId_piloto());
		System.out.println("Nombre: " +getNombre());
		System.out.println("Documento: "+getDocumento());
		System.out.println("Edad: "+getEdad());
		System.out.println("Sexo: "+getSexo());
		System.out.println("============================");
	}
	
	
	
}

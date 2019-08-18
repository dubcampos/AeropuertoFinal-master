
public class Personas {
	
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private char sexo;
	private String documento;
	
	
	//CONTRUCTORES
	public Personas(String nombre, int edad, char sexo, String documento) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.documento = documento;
	}
	
	public Personas() {
		this.nombre = "NAME";
		this.edad = 0;
		this.sexo = 'U';
		this.documento = "DNI/CE/PASSPORT";
	}
	
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
	

}

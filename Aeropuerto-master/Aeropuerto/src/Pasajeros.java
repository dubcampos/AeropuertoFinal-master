
public class Pasajeros extends Personas{
	
		//CONTRUCTORES
		
		public Pasajeros(String nombre, int edad, char sexo, String documento ) {
				super(nombre, edad, sexo, documento);
				
			}
		
		public Pasajeros() {
			super();		
		}
		
		
		public void Imprimir() {
			
			
				System.out.println("==========PASAJERO==========");
				System.out.println("Nombre: " +getNombre());
				System.out.println("Documento: "+getDocumento());
				System.out.println("Edad: "+getEdad());
				System.out.println("Sexo: "+getSexo());
				System.out.println("----------------------------");
				
			
		}
		
		
}
 
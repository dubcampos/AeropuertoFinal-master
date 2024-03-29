import java.util.ArrayList;
import java.util.List;

public class Vuelos {
	
	//ATRIBUTOS
	private String hora;
	private String procedencia;
	private String destino;
	private boolean retraso;
	private List<Pasajeros> lista_pasajeros = new ArrayList <Pasajeros>();
	private List<Pilotos> lista_pilotos = new ArrayList <Pilotos>();
	private List<Aviones> lista_aviones = new ArrayList <Aviones>();
	
	
	
	//CONTRUCTORES

	public Vuelos(String hora, String procedencia, String destino, boolean retraso, List<Pasajeros> lista_pasajeros, List<Pilotos> lista_pilotos, List<Aviones> lista_aviones) {
		this.hora = hora;
		this.procedencia = Procedencia();
		this.destino = destino;
		this.retraso = retraso;
		this.lista_pasajeros = lista_pasajeros;
		this.lista_pilotos = lista_pilotos;
		this.lista_aviones = lista_aviones;
	}
	
	public Vuelos() {
		this.hora = "00:00";
		this.procedencia = Procedencia();
		this.destino = "Punto B";
		this.retraso = false;
		this.lista_pasajeros = new ArrayList<Pasajeros>() ;
		this.lista_pilotos = new ArrayList<Pilotos>();
		this.lista_aviones = new ArrayList<Aviones>();
		}
	
	//GETTERS & SETTERS
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public boolean getRetraso() {
		return retraso;
	}

	public void setRetraso(boolean retraso) {
		this.retraso = retraso;
	}
	
	
	
	
	public List<Pasajeros> getLista_pasajeros() {
		return lista_pasajeros;
	}

	public void setLista_pasajeros(List<Pasajeros> lista_pasajeros) {
		this.lista_pasajeros = lista_pasajeros;
	}

	public List<Pilotos> getLista_pilotos() {
		return lista_pilotos;
	}

	public void setLista_pilotos(List<Pilotos> lista_pilotos) {
		this.lista_pilotos = lista_pilotos;
	}

	public List<Aviones> getLista_aviones() {
		return lista_aviones;
	}

	public void setLista_aviones(List<Aviones> lista_aviones) {
		this.lista_aviones = lista_aviones;
	}

	public String Procedencia() {
		Aeropuerto procedencia = new Aeropuerto();
		String ciudadA = procedencia.getCiudad();
		return ciudadA;
		
		
	}
	
	
	//METODOS
	
	//===================PASAJEROS===================//
	
	public void GenerarPasajeros() {
		Pasajeros p1 = new Pasajeros("Duber0 Campos", 31, 'M', "70008882");
		Pasajeros p2 = new Pasajeros("Duber1 Campos", 31, 'M', "70008882");
		Pasajeros p3 = new Pasajeros("Duber2 Campos", 31, 'M', "70008882");
		Pasajeros p4 = new Pasajeros("Duber3 Campos", 31, 'M', "70008882");
		Pasajeros p5 = new Pasajeros("Duber4 Campos", 31, 'M', "70008882");
		Pasajeros p6 = new Pasajeros("Duber5 Campos", 31, 'M', "70008882");
		lista_pasajeros.add(p1);
		lista_pasajeros.add(p2);
		lista_pasajeros.add(p3);
		lista_pasajeros.add(p4);
		lista_pasajeros.add(p5);
		lista_pasajeros.add(p6);	
		}
		
		
	
	public void Imprimir() {
		System.out.println("============VUELO===========");
		System.out.println("Hora partida: "+hora);
		System.out.println("Ciudad Destino: "+destino);
		System.out.println("============================");
		
		ImprimirAvion("XHG-589-PE");
		//IMPRIMIR LISTADO DE PILOTOS
		ImprimirPiloto("1501");
		//IMPRIMIR LISTADO DE PASAJEROS
		ImprimirPasajeros();
	}
	
	public void ImprimirPasajeros() {
		GenerarPasajeros();
		for (Pasajeros pasajeros : lista_pasajeros) {
			pasajeros.Imprimir();
			
		}
	}
	
	//===================PILOTOS===================//
	
	
	public void GenerarPilotos() {
		Pilotos pi1 = new Pilotos("Piloto01", 30, 'M', "29292929", "1501");
		Pilotos pi2 = new Pilotos("Piloto02", 30, 'M', "29292929", "1502");
		Pilotos pi3 = new Pilotos("Piloto03", 30, 'M', "29292929", "1503");
		Pilotos pi4 = new Pilotos("Piloto04", 30, 'M', "29292929", "1504");
		Pilotos pi5 = new Pilotos("Piloto05", 30, 'M', "29292929", "1505");
		Pilotos pi6 = new Pilotos("Piloto06", 30, 'M', "29292929", "1506");
		lista_pilotos.add(pi1);
		lista_pilotos.add(pi2);
		lista_pilotos.add(pi3);
		lista_pilotos.add(pi4);
		lista_pilotos.add(pi5);
		lista_pilotos.add(pi6);	
		}
		
		
	
	
	
	public void ImprimirPiloto( String pilotoid) {
		GenerarPilotos();
		
		
		for (Pilotos pilotos : lista_pilotos) {
			if (pilotoid==pilotos.getId_piloto()) {
				pilotos.Imprimir();
			}
		}
	}
	
	public void GenerarAviones() {
		Aviones avion1 = new Aviones("XHG-589-PE", "Boeing", "747", 3, 660);
		Aviones avion2 = new Aviones("TGY-812-PE", "Airbus", "A320", 2, 220);
		Aviones avion3 = new Aviones("GYH-681-PE", "Boeing", "747", 3, 660);
		Aviones avion4 = new Aviones("TGS-859-PE", "Boeing", "777", 2, 400);
		Aviones avion5 = new Aviones("UJK-158-PE", "Airbus", "A320", 2, 220);
		Aviones avion6 = new Aviones("SEF-983-PE", "Boeing", "777", 2, 400);
		lista_aviones.add(avion1);
		lista_aviones.add(avion2);
		lista_aviones.add(avion3);
		lista_aviones.add(avion4);
		lista_aviones.add(avion5);
		lista_aviones.add(avion6);
		
	}
	
	public void ImprimirAvion( String matricula) {
		GenerarAviones();
		
		for (Aviones aviones : lista_aviones) {
			if (matricula == aviones.getMatricula())
			aviones.Imprimir();
		}
	}
	
	
	
	
	
	
	
}

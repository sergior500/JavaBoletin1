package javaObjetos.feb.ejercicio1;

public class Avion {
	private String idAvion;
	private final Integer capacidad;
	private Integer numVuelos = 0;
	private Double kmVolados = 0.0;
	private String compannia;


	//Constructores
	public Avion (String idAvion,Integer capacidad){
		this.idAvion = idAvion;
		this.capacidad = capacidad;
	}
	public Avion (String idAvion,String compannia, Integer capacidad) {
		this.idAvion = idAvion;
		this.compannia = compannia;
		this.capacidad = capacidad;
	}
	//Metodos
	public boolean asignarVuelo(int viajeros, Double km) {
		boolean posibleAsignarVuelo = false;
		if (viajeros <= this.capacidad) {
			this.kmVolados +=km;
			this.numVuelos++;
			posibleAsignarVuelo = true;
		}
		
	return posibleAsignarVuelo;
	}
	
	
	//Getters and setters
	public Double getMediaKms() {
		double resultado = 0;
		if (numVuelos>0) {
			resultado = this.kmVolados/numVuelos;
		}
		
		return resultado;
	}
	public Integer getNumVuelos() {
		return numVuelos;
	}
	public Double getKmVolados() {
		return kmVolados;
	}
	/*public Double getMediaKm() {
		Double resultado = kmVolados/numVuelos;
		return resultado;
	}*/
	public String getIdAvion() {
		return idAvion;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public String getCompannia() {
		return compannia;
	}
	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}
	private void setNumVuelos(Integer numVuelos) {
		this.numVuelos = numVuelos;
	}
	private void setKmVolados(Double kmVolados) {
		this.kmVolados = kmVolados;
	}
	private void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}
	
	public String getInformacionAvion() {
		return "Avión con id: "+ getIdAvion()+" de la compañía "+ getCompannia()+" ha realizado\n"
				+ getNumVuelos()+" vuelos, con un total de "+ getKmVolados()+" km y una media de\n"
				+  getMediaKms()+" km por vuelo.”";
	}
	
	public String toString() {
		return "Avión con id: "+ getIdAvion();
	}
	/*" de la compañía "+ getCompannia()+" ha realizado\n"
	+ getNumVuelos()+" vuelos, con un total de "+ getKmVolados()+" km y una media de\n"
	+  getMediaKms()+" km por vuelo.”*/
	

}
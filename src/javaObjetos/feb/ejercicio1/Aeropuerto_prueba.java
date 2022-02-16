package javaObjetos.feb.ejercicio1;

public class Aeropuerto_prueba {
	public static void main(String[] args) {
		crearParqueAeropuerto();
	}

	public static void crearParqueAeropuerto() {
		Avion[] aeropuerto = new Avion[50];
		String nombre = "Avion";
		
		for (int i = 0; i<50; ++i) {
			Avion avion1 = new Avion ((nombre + String.valueOf(i)),120);
			aeropuerto[i] = avion1;
		}
		for (int j = 0; j < aeropuerto.length; ++j) { 
		System.out.println(aeropuerto[j]);
		}
	}
}

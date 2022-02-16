package javaObjetos.feb.ejercicio1;

import java.util.Scanner;

public class Aeropuerto {
	public static String MENU_SECUNDARIO = "Selecciona opcion: \n "
			+ "a.Asignar Vuelo \n "
			+ "b.Obtener el numero de vuelos. \n "
			+ "c.Obtener Kilometros volados. \n "
			+ "d.Obtener media de Kilometros. \n "
			+ "e.Cambio de compañia\n"
			+ "f.Informacion sobre el vuelo. \n"
			+ "g.Salir";

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Avion nuevoAvion = crearAvionConMenu();
		
		
		System.out.println(MENU_SECUNDARIO);
		
		String opcion1 = sc.nextLine();
		
		do 
		{
			if (opcion1.equalsIgnoreCase("a")){
				System.out.println("¿Cuantos viajeros van en este viaje? ");
				int numeroViajeros = Integer.valueOf(sc.nextLine());
				System.out.println("¿Cuantos kms recorre este viaje?");
				double kmVolados = Integer.valueOf(sc.nextLine());
				
				if (nuevoAvion.asignarVuelo(numeroViajeros,kmVolados)) {
					System.out.println("########################################\n"
							+"El vuelo se ha asignado correctamente.");
				}else {
					System.out.println("########################################\n"
							+"El vuelo no se ha podido asignar correctamente.");
				}
				
			}else if(opcion1.equalsIgnoreCase("b")) {
				
				System.out.println("########################################\n"
						+"El avion ha volado "+nuevoAvion.getNumVuelos()+" veces.");
				
			}else if (opcion1.equalsIgnoreCase("c")) {
				
				System.out.println("########################################\n"
						+"El avion ha recorrido "+nuevoAvion.getKmVolados()+"Kilometros");
				
			}else if(opcion1.equalsIgnoreCase("d")){
				
				System.out.println("########################################\n"
						+nuevoAvion.getMediaKms());
				
			}else if (opcion1.equalsIgnoreCase("e")) {
				
				System.out.println("########################################\n"
						+"La compañia actual es "+nuevoAvion.getCompannia()+"\n "
						+ "Si quiere cambiar la compañia pulse '1'.");
				String opcion2 = sc.nextLine() ;
				
				if (opcion2.equalsIgnoreCase("1")) {
					System.out.println("Introduce la nueva compañia");
					nuevoAvion.setCompannia(sc.nextLine());
				}
				
				
				
			}else if (opcion1.equalsIgnoreCase("f")) {
				
				System.out.println("########################################\n"
						+nuevoAvion.getInformacionAvion());
			}
			System.out.println("########################################\n"
					+MENU_SECUNDARIO);
			opcion1 = sc.nextLine();
		}while(!opcion1.equalsIgnoreCase("g"));
		sc.close();
}
	
	

		
		/*
		nuevoAvion.asignarVuelo(100, 10000.00);
		nuevoAvion.asignarVuelo(10, 5000.00);
		nuevoAvion.asignarVuelo(150, 6000.00);
		nuevoAvion.asignarVuelo(110, 6000.00);*/
	
	public static Avion crearAvionConMenu(){
		System.out.println(""
					+"1.Crear avion sólo con el identificador.\n"
					+"2.Crear avión con el identificador y la compañia.\n"
					+"#####################################################");
		
		Avion avionCreado = null;
		
		
		int op = Integer.valueOf(sc.nextLine());
		
		if (op==1) {
			
			System.out.println("Introduzca el identificador del avión: ");
			String identificador = sc.nextLine();
			System.out.println("Introduzca la capacidad del avión: ");
			int capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(identificador,capacidad);
			
		}else if (op==2) {
			
			System.out.println("Introduzca el identificador del avion: ");
			String identificador = sc.nextLine();
			System.out.println("Introduzca la capacidad del avión: ");
			int capacidad = Integer.valueOf(sc.nextLine());
			System.out.println("Introduzca la compañia: ");
			String compannia = sc.nextLine();
			
			avionCreado = new Avion (identificador,compannia,capacidad);
		}else {
			
			System.out.println("La opción seleccionada no es correcta.");
			
		}
		
		
		
		
		return avionCreado;
	}
}
 

package javaObjetos.feb.EjercicioCafe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner (System.in);		
		Maquina maquina = new Maquina();


		
		
		String opcion;
		
		do {
			
		
		System.out.println("\n1- Servir caf� solo (1 euro)"
						 + "\n2- Servir leche (0,8 euros)"
						 + "\n3- Servir caf� con leche (1,5 euros)"
						 + "\n4- Consultar estado m�quina"
						 + "\n5- Apagar y salir\n");
		
		opcion = sc.nextLine();
		
		switch (opcion) {
		case "1":{ //cafe solo
			maquina.servirCafe(opcion);
			
		}break;
		case "2":{ //leche
			maquina.servirCafe(opcion);

		}break;
		case "3":{ //cafe con leche
			maquina.servirCafe(opcion);

		}break;
		case "4":{ //consultar estado
			maquina.consultaEstado();
		}break;
		case "5":{ //salir
			
		}
		default:
			break;
		}		
		
		}while (!opcion.equals("5"));
	
		sc.close();
	}

}

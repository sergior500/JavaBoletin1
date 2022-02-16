package javaObjetos.feb.EjerciciosRelacion6Casa;

import java.util.Scanner;

public class RectanguloMainCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectanguloCasa nuevoRectangulo = new RectanguloCasa();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduce el Ancho: ");
			
			Double ancho = sc.nextDouble();
			nuevoRectangulo.setAncho(ancho);
			
			System.out.println("Introduce la Longitud: ");
			
			Double longitud = sc.nextDouble();
			nuevoRectangulo.setAncho(longitud);
			System.out.println(nuevoRectangulo);
		}catch(RectanguloException errorRectangulo){
			System.out.println("Se ha producido una execpcion: " +errorRectangulo.getMessage());
		}
		sc.close();
		
		
	
	
	
	}

}

//Double longitud, Double ancho
package javaObjetos.feb.EjerciciosRelacion6;

import java.util.Scanner;

public class RectanguloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el Ancho: ");
	Double ancho = sc.nextDouble();
	System.out.println("Introduce la Longitud: ");
	Double longitud = sc.nextDouble();
	
	Rectangulo nuevoRectangulo = new Rectangulo(longitud,ancho);
	
	System.out.println(nuevoRectangulo.Area(longitud, ancho));
	System.out.println(nuevoRectangulo.Perimetro(longitud, ancho));
	}

}

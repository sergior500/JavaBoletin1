package javaObjetos.feb.EjerciciosRelacion6;

public class Rectangulo {

	private Double longitud;
	private Double ancho;
	
	/*Constructor*/
	
	public Rectangulo(Double longitud,Double ancho) {
		this.longitud = longitud;
		this.ancho = ancho;
	}
	
	/*Metodos*/
	
	public String Perimetro(Double longitud, Double ancho) {
		Double lado1 = longitud*2;
		Double lado2 = ancho*2;
		return "El perimetro es de"+(lado1+lado2);
	}
	
	public String Area(Double longitud, Double ancho) {
		return "El area es de "+(longitud*ancho);
	}
	
	/*Getters y Setters*/
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		if (longitud>0 && longitud<20) {
			this.longitud = longitud;
		}else {
			System.out.println("Los datos son incorrectos");
		}
		
	}
	public Double getAncho() {
		return ancho;
	}
	public void setAncho(Double ancho) {
		if (ancho>0 && ancho<20) {
			this.ancho = ancho;
		}else {
			System.out.println("Los datos son incorrectos");
		}
	}

	
	
}

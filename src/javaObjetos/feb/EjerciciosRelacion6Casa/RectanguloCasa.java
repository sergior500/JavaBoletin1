package javaObjetos.feb.EjerciciosRelacion6Casa;

public class RectanguloCasa {

	private Double longitud;
	private Double ancho;
	
	/*Constructor*/
	
	public RectanguloCasa() {
		this.longitud = 1.00;
		this.ancho = 1.00;
	}
	
	public RectanguloCasa(Double longitud,Double ancho) {
		setAncho(ancho);
		setLongitud(longitud);
	}
	
	/*Metodos*/
	
	public String Perimetro() {
		String resultado;
		if (longitud == 1.0 && ancho == 1.0) {
			resultado = "Los valores para calcular el Perimetro son incorrectos. Los valores se han mantenido por defecto. ";

		}else {
			Double lado1 = longitud*2;
			Double lado2 = ancho*2;
			resultado = "El perimetro es de "+(lado1+lado2);
		}
		
		return resultado;
	}
	
	public String Area() {
		String resultado;
		if (longitud == 1.0 && ancho == 1.0) {
			resultado = "Los valores para calcular el Area son incorrectos. Los valores se han mantenido por defecto. ";

		}else {
			resultado = "El area es de "+(longitud*ancho);
		}
		return resultado ;
	}
	
	/*Getters y Setters*/
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		if (longitud>0.0 && longitud<20.0) {
			this.longitud = longitud;
		}else {
			throw new RectanguloException("No es valido, la longitud.");
		}
		
	}
	public Double getAncho() {
		return ancho;
	}
	public void setAncho(Double ancho) {
		if (ancho>0.0 && ancho<20.0) {
			this.ancho = ancho;
		}else {
			throw new RectanguloException("No es valido, el ancho.");
		}
		
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("El ancho del rectángulo es: ");
		sb.append(getAncho());
		sb.append("\n");
		sb.append("y su longitud es: ");
		sb.append(getLongitud());
		sb.append(". \n");
		sb.append("Su perimetro es: ");
		sb.append(Perimetro());
		sb.append(" y su area: ");
		sb.append(Area());
		return	sb.toString();
	}
	
	
}

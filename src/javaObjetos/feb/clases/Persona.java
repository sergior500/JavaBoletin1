package javaObjetos.feb.clases;

public class Persona {
	
		//atributos --> caracteristicas
		private String nombre = "Nombre defecto";
		private String apellidos = "Apellido defecto";
		private int edad;
		private double altura;
		protected String dni;

		//constructor
		public Persona() {
			apellidos = "apellido vacio";
			nombre = "nombre vacio";
			edad = 18;
			altura = 1.70;
		}
		
		public Persona(String nombre, String apellidos, int edad, double altura) {
			if (!apellidos.isEmpty()) {
			this.apellidos = apellidos;
			}
			if (!nombre.isEmpty()) {
			this.nombre = nombre;
			}
			if (edad>0 && edad<150) {
			this.edad = edad;
			}
			if (altura>0 && altura <4) {
			this.altura = altura;
			}
		}
		
		public void saludar() {
			System.out.println("Hola mi nombre es "+this.nombre+" Mi apellido es "+this.apellidos+". Tengo "+this.edad+" años. Mi altura es de "+this.altura+" metros.");
		}
		
		public double getAltura() {
			return altura;
		}
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public int getEdad() {
			
			return edad;
		}
		public void setEdad(int edad) {
			if (edad>0 && edad<115) {
				this.edad=edad;
			}
		}
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getApellidos() {
			return apellidos;
		}
		
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
}

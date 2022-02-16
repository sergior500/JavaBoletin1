package javaObjetos.feb.clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona manuel = new Persona("Manuel","Pacorro",20,2);
		Persona antonio = new Persona();
		Persona maria = new Persona();
		
		
		antonio.setAltura(1.8);
		antonio.setEdad(30);
		antonio.setNombre("Antonio");
		antonio.setApellidos("sevillano");
		
		maria.setAltura(2);
		maria.setEdad(25);
		maria.setNombre("Maria");
		maria.setApellidos("Gutierrez");
		
		System.out.println(manuel.getEdad());
		System.out.println(antonio.getAltura());
		manuel.saludar();
	}

}

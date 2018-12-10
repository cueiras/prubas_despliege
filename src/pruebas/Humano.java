package pruebas;


import java.util.Scanner;
import java.io.File;
public class Humano {



	


	private void hola() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("hola");
	}


	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private void initTodo() {
		File fichero = new File("hola.txt");
	}
	
	
}





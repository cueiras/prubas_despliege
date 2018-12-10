package pruebas;


import java.util.Scanner;
import java.io.File;
public class Humano {

	private void hola() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("hola");
	}


	
	private int id;
	private int zapato;
	
	public int getZapato() {
		return zapato;
	}

	public void setZapato(int zapato) {
		this.zapato = zapato;
	}

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





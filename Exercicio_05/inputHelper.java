package Exercicio_05;
import java.util.Scanner;


public class inputHelper {
	
	static String pegarInput(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.print(texto);
		String inputTexto = sc.nextLine();
		return inputTexto;
	}
	
	static int inputInt(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.print(texto);
		int inputInt = Integer.parseInt(sc.nextLine());
		return inputInt;
	}
	
	static double inputDouble(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.print(texto);
		double inputDouble = Double.parseDouble(sc.nextLine());
		return inputDouble;
	}
	
	
	
	
}
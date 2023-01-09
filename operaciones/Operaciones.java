package operaciones;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		System.out.println("Menu");
		Scanner sc = new Scanner (System.in);
		int numUno,numDos,numTres;
		
		System.out.println("Escriba tres numeros: ");
		System.out.println("Primer numero: ");
		numUno = sc.nextInt();
		System.out.println("Segundo numero: ");
		numDos = sc.nextInt();
		System.out.println("Tercers numero: ");
		numTres = sc.nextInt();
		System.out.println("cuarto numero: ");
		numTres = sc.nextInt();
		System.out.println("quinto numero: ");
		numTres = sc.nextInt();
		
		System.out.println("La suma de los tres numeros es: " + (numUno + numDos + numTres));
		System.out.println("La suma de los tres numeros es: " + (numUno - numDos - numTres));
		System.out.println("La media: " + (numUno + numDos + numTres)/3);
		System.out.println("Programa terminado");
		

	
	}

}

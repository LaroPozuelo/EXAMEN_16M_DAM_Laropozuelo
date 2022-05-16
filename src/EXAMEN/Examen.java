package EXAMEN;

import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		
		System.out.println("Buenos días Ceinmark, soy Laro");
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		int num=input.nextInt();
		boolean es=true;
		
		
		for(int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            System.out.println(num);
	            es=false;
	        }
	    }
		if(es) {
			System.out.println("El numero es primo y solo es divisible entre 1 y el mismo.");
		}else {
			System.out.println("El numero no es primo es divisible entre todos los numeros anteriores y el 1 y el mismo.");
		}
		
		

	}

}

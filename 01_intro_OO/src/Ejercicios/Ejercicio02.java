package Ejercicios;

public class Ejercicio02 {

	
	public static void main(String[] args) {
		double num1 = 5.20;
		int num2 = 15;
		double resultado = 0;
		int resul = 0;
		
		System.out.println("la suma es : " + (num1 + num2));
	/*	System.out.println("la suma es : " + resultado); */
		System.out.println("la resta es : "+ (num1 - num2));
		System.out.println("la producto es : "+ (num1 * num2));
		System.out.println("la division es : "+ (num1 / num2));
		System.out.println("el resto de la div es : "+ (num1 % num2));
		
		resultado = num1 % num2;		
		resul = (int)(num1 + num2);
		System.out.println("tras castin 1: " + resul);	
		resul = (int)(num1 * num2);
		System.out.println("tras castin 2: " + resul);
				
	}
	

}

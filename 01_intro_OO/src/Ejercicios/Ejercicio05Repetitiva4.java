package Ejercicios;

public class Ejercicio05Repetitiva4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int) (Math.random()*50+1));
		
		int numero = 0, pares = 0, impares = 0, suma = 0;
		double media = 0;
		for (int i=1; i<=10; i++) {
			numero= (int) (Math.random()*50+1);
			System.out.println("saca el numero " + numero);
			suma = suma + numero;
			if (numero%2 == 0)
				pares++;
			else
				impares++;
			
		}
		System.out.println("pares : " + pares);
		System.out.println("impares : " + impares);
		System.out.println("suma : " + suma);
		media = (double) suma/10;
		System.out.println("media : " + media);
}
	
	}	

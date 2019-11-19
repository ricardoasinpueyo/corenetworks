package Ejercicios;

public class Ejercicio16bisExplicacionArrays {
	
	public static void main(String[] args) {
			
		//prueba Array vacio
		pruebaArrayvacio();
	}
		public static void pruebaArrayvacio() {
			String[] cadenas = new String [6];
			cadenas[0] = "zacarias";
			cadenas[1] = "esteban";
			cadenas[2] = "carmen";
			cadenas[3] = "natalia";
			cadenas[4] = "ana";
			cadenas[5] = "ricardo";
			
			int [] numeros = new int [7];
			// carga del array con numeros aleatorios
			
			for(int i=0; i<numeros.length; i++)
				numeros[i] = (int) (Math.random()*50+1);
			
			for (String ele: cadenas)
				System.out.println(ele); 
			
			for (int ele: numeros)
				System.out.println(ele);

		}
	}
package Ejercicios;

public class Ejercicio16ExplicacionArrays {

	public static void main(String[] args) {
		
		String cadena = "tomas;andres;ana;esteban;sara;ignacio;mariel";
		// esto lo va a devolver una array de String, sigue en&		
		
		int[] pares = {2,6,8,10,34,68};
		String[] nombres = {"andres","esteban", "Zacarias", "Eva", "Ana"};
	//	System.out.println(pares.length);
	//	System.out.println(nombres.length);
		pares[1]=66;
		// si quiero poner un 66 en la posicion 1
		
		for (int i=0; i<pares.length; i++)
		System.out.println("en la posicion " +i + " hay " + pares[i]);
		
		for (String ele: nombres) {
			System.out.println("me llamo; " + ele);
		}
		System.out.println("\n\n\n"); /*esto me hace tres saltos de carro*/

		//&	nombre2 representa un array de string
		String [] nombre2 = cadena.split(";");
		for(String ele: nombre2)
			System.out.println("nombre2 : " + ele);

		System.out.println("\n\n\n");
		
		/* además lo puedo hacer directamente de esta forma es decir si una variable 
		la tengo que utilizar varias veces lo puedo hacer asi:(y me sale lo mismo)*/
		
		for (String ele: cadena.split(";"))
			System.out.println("nombre2 : " + ele);
	}
}
	
	
	
	
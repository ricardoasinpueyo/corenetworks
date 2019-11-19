package Ejercicios;

public class Ejercicio14Repetitivas03 {

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*2.	(Escribir los números múltiplos de 3 y de 7, que hay entre el 1 y el 250.)
			 * 3. Lo mismo que el anterior, y además escribir al final, cuántos de los 250 son:
a.	Múltiplos de 3 y de 7.
b.	Cuantos hay múltiplos solo de 3
c.	Cuantos hay múltiplos solo de 7.
*/
			int mult37 = 0, mult3 = 0, mult7 =0;
			for(int i=1; i<= 250; i++) {
				if (i%3 == 0)
					mult3++;
				if(i%7 == 0)
					mult7++;
				if(i%3 ==0 && i%7 == 0) 
				{System.out.println("mult 3 y 7 : " + i);
					mult37++;}
				}
					System.out.println("mult de 3 :"+ mult3);
					System.out.println("mult de 7 :"+ mult7);
					System.out.println("mult de 3 y 7 :"+ mult37);
					System.out.println("de ninguno : " +(250-mult3-mult7 + mult37));
/*

/* ahora vamos a hacer el mismo ejercicio pero con el else */
/*VERSION 2 */
					
					
System.out.println("VERSION 2");
mult37=0;
mult3=0;
mult7=0;
for(int i=1 ; i<=250 ; i++) 
{
	 if(i%3 !=0 && i%7 !=0)
	continue;
if (i%3 == 0 && i%7 == 0) {
	mult3++;
	mult7++;
	mult37++;
	System.out.println("es multiplo de 37: " + i);
}
else
	if(i%3 == 0)
		mult3++;
	else
		mult7++;
}
System.out.println("mult3 :" + mult3);
System.out.println("mult7 :" + mult7);
System.out.println("mult37 :" + mult37);
System.out.println("de ninguno :" + (250-mult3-mult7+mult37));



}
}

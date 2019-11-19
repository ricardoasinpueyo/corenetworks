package beans;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes = 7;
		switch(mes) {
		case 1: case 3 : case 5: case 7: case 8: case 10: case 12:
			System.out.println("el mes : " + mes + " es de 31 ");
       break;
	    case 4 : case 6: case 9: case 11:
	   System.out.println("el mes : " + mes + " es de 30");
	   break;
	   case 2:
	   System.out.println("el mes : "+ mes +  "es de 28/29");
	   break;
	   default:
	 
		   System.out.println("tas equivocao del 1 al 12");

		   System.out.println("terminao");
	} 
		}
}
	


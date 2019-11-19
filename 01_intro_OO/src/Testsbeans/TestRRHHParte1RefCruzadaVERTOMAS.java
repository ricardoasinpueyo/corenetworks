package Testsbeans;

import Beans.Departamento;
import Beans.Empleado;

public class TestRRHHParte1RefCruzadaVERTOMAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ahora me creo un departamento con jefe null y 3 empleados y uno de ellos
 * es el Jefe . Para demostrar una referencia cruzada*/
		
				
Departamento dep30 = new Departamento(30, "Ventas", null);
Empleado emp114, emp115, emp116, emp300;


emp114 = new Empleado(114, "diego", "martinez", 30_000, 45, dep30);
emp115 = new Empleado(115, "sara", "perez", 20_000, 27, dep30);
emp116 = new Empleado(116, "carlos", "sanchez", 10_000, 30, dep30);
emp300 = new Empleado(300, "natalia", "vazquez", 60_000, 28, dep30);
/* con el set meto el jefe al emp114*/

dep30.setJefe(emp114);

/*Ahora vamos a crear un departamento nuevo que es Formación y se va a meter
 * un emp225 que se llama Carmen Gonzalez que gana 70_000 y que pertenece al dep30*/
 
 Departamento dep120 = new Departamento(120,"Formación", new Empleado(225, "Carmen", "González", 70_000, 32, dep30));
 dep120.getJefe().setDepartamento(dep120);
 
 /* Vamos a crear el emp300 que se llama natalia vazquez, 
  * 60_000, dep30 y vamos a crear un departamento 130 de logistica*/
 Departamento dep130 = new Departamento(130, "Logistica", emp300);
 /* ahora al emp300 le vamos a cambiar de departamento*/
 emp300.setDepartamento(dep130);
 
 System.out.println("dep 120 : " + dep120.getJefe().getDepartamento().getNombre());
 System.out.println("dep 130 : " + dep130.getJefe().getDepartamento().getNombre());
 /*si añadimos */
 //System.out.println(dep130);
 
 /* me aparece el error StackOverflowError*/
 
	}

}

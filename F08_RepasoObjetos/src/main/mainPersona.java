package main;

import java.util.ArrayList;

import bean.Direccion;
import bean.Persona;

public class mainPersona {
 
	
	public static void main (String[] args) {
	
    Persona p1 = new Persona();
    Persona pAux = p1;
    p1.setNombre("Bud Spencer");
    p1.setEdad(89);
    p1.setPeso(120);

    Persona p2 = new Persona("Terence Hill",67,70);
    pAux.setEdad(33);
    System.out.println(p1.getEdad());
    cambiarEdad(p1);
    System.out.println(pAux.getEdad());
    
    p2=pAux;
    int numero = 50;
    System.out.println(numero);
    
    System.out.println();
    System.out.println(pAux);
    
    ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
    Persona p3=new Persona();
    p3.setNombre("Harry Potter");
    p3.setEdad(19);
    p3.setPeso(56);
    
    //System.out.println(listaPersonas.get(0));
    p3.setEdad(20);
    //listaPersonas.get(0).setEdad(20);
    
    listaPersonas.add(p3);
    listaPersonas.add(pAux);
    pAux = null;
    		
    System.out.println(listaPersonas);
    
    int cp = 01234; //esto no coincide en la consola porque lo expresa en base octal como 668
    cp = 0xFFf; //base hexadecimal
    cp = 0b101; //binario
    System.out.println(cp);
   
    Persona p4 = new Persona();
    		p4.setNombre("Mortadelo");
    		p4.setEdad(80);
    		p4.setPeso(70);
    		
    		Direccion d1 = new Direccion();
    		d1.setTipoVia ("calle");
    		d1.setNombreVia ("Gran V�a");
    		d1.setCiudad("Madrid");
    		d1.setCp("28045");
    		
    		p4.setDireccion(d1);
    		
    		listaPersonas.add(p4);
    	
    		System.out.println(p4);
	}		
    		
    		
public static void cambiarEdad(Persona p) {
	p.setEdad(45);
}
 public static void cambiarEntero(int numero) {
	 numero = 100;
 }
	
}

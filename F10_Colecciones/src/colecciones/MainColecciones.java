package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import bean.Persona;

public class MainColecciones {

	public static void main(String[] args) {
		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Mortadelo");
		listaNombres.add("Filemon");
		listaNombres.add("Dr. Bacterio");
		listaNombres.add("Ofelia");
		listaNombres.add("Super intendente Vicente");

		System.out.println(listaNombres.get(0)); // Mortadelo
		System.out.println(listaNombres.get(3)); /* imprime a Ofelia */
		System.out.println(listaNombres.size()); // 5

		// manera mala o poco usada de recorrer arrays
		for (int i = 0; i < listaNombres.size(); i++)
			;
		int i = 3;
		System.out.println("******************");
		// manera buena, esta es la que hay que usar normalmente
		// for each
		// la primera parte hay que declarar una variable dentro del for del mismo tipo
		// que la lista que queremos recorrer
		// la segunda parte es la lista que queremos recorrer
		for (String valor : listaNombres) {
			System.out.println(valor);
		}
		System.out.println("******array enteros*******");
		// si queremos crear un array de enteros, debemos
		// de usar su correspondiente tipo wrapper (envoltorio)
		// todos los primitivos tiene su tipo wrapper
		Integer entero = new Integer(4);
		Integer entero2 = 5; // auto boxing
		double primitivoDouble = 6.9;
		Double objetoDouble = 6.9;
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		listaEnteros.add(1); // auto boxing
		listaEnteros.add(45);// auto boxing
		listaEnteros.add(new Integer(89));

		for (Integer v : listaEnteros) {
			System.out.println(v);
		}
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p1 = new Persona();
		p1.setNombre("Penelope");
		p1.setEdad("33");

		Persona p2 = new Persona();
		p2.setNombre("Ana");
		p2.setEdad("45");

		listaPersonas.add(p1);
		listaPersonas.add(p2);

		for (Persona p : listaPersonas) {

			System.out.println("1 - El nombre es : " + p.getNombre());
			System.out.println("2 - La edad es : " + p.getEdad());
			System.out.println("***************");

		}
		
		listaPersonas.remove(1); // podemos eliminar por posicion, pero sigue existiendo el Objeto Ana
		System.out.println(listaPersonas);
		
		//no podemos acceder a una posicion que no existe
		//System.out.println(listaPersonas.get(1));
		/*p2 = null; // ahora si que nos hemos quedado sien el objeto ana*/
		System.out.println("***********Mapas***********");
		HashMap<String, String> mapaUsuarioContrasenia = new HashMap<String, String>();
		mapaUsuarioContrasenia.put("felix","1234");
		
		//siempre accedemos por clave
		System.out.println(mapaUsuarioContrasenia.get("felix"));
		mapaUsuarioContrasenia.remove("felix");
		System.out.println(mapaUsuarioContrasenia.get("felix")); //ahora me sale un null
		
		mapaUsuarioContrasenia.put("pepe", "987654321");
		System.out.println(mapaUsuarioContrasenia.get("pepe"));//ahora me saca el nuevo valor
		
		
		HashMap<String, Persona> mapaUsuarioPersona = new HashMap<String, Persona>();
		mapaUsuarioPersona.put(p1.getNombre(), p1);
		mapaUsuarioPersona.put(p2.getNombre(), p2);
		
		System.out.println(mapaUsuarioPersona);
	}

}

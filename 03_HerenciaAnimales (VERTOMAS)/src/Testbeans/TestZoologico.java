package Testbeans;

import beans.Animal;
import beans.Gato;

public class TestZoologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a1 = new Animal("camaleon - verde");
Animal a2 = new Animal("hipotatimo - marron");

Gato gato1 = new Gato("gato siames", 7);
Gato gato2 = new Gato("callejero", 5);

a1.sonido();

Animal[] zoo = {a1, a2, gato1, gato2};

for (Animal ele: zoo) {
	ele.sonido();
		System.out.println(ele);
		if (ele instanceof Gato)
		((Gato) ele).mostrarDatos();

}
	}}



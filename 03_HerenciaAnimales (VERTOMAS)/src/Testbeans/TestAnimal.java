package Testbeans;

import beans.Animal;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a1,a2,a3; 
a1 = new Animal ("camaleon verde");
a2 = new Animal ("buho rojo");
a3 = new Animal ("nisesabenegro");

System.out.println(a1 +"- " + a2 + "-" + a3 + "_");
a1.saludar();
a1.sonido();


Animal [] zoologico = {a1,a2,a3};
for (Animal ele: zoologico) {
	System.out.println(ele.getColor() + "-");
	ele.sonido(); 
}
}}
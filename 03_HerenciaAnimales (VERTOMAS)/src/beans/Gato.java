package beans;

public class Gato extends Animal {
private int vidas;

public int getVidas() {
	return vidas;
}

public void setVidas(int vidas) {
	this.vidas = vidas;
}

/* generamos dos constructores*/

public Gato() {
	super();
	}


public Gato(String color, int vidas) {
	super(color);
	this.vidas = vidas;
}


public void mostrarDatos () {
System.out.println("Vidas : "+vidas);
System.out.println("color : " + color);

}

	// TODO Auto-generated method stub
	
}



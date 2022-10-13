package forma;


public class main {
	
	public static void main(String[] args) {
		
		Triangulo tri = new Triangulo(4.0, 3.0);
		Quadrado qua = new Quadrado(3.0, 5.0);
		Retangulo retan = new Retangulo(5.0, 3.0);
		Circulo circ = new Circulo(5.0);
		
		
		tri.area();
		qua.area();
		retan.area();
		circ.area();
		
	}
	
}

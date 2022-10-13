package forma;

public class Circulo {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
		
	}
	
	public void area(){
		
		double area = Math.PI * raio * raio;;
		System.out.println(area); 
		
	}
}

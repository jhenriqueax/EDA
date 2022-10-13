package forma;

public class Retangulo {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		
	}
	
	public void area(){
		
		double area = (largura * altura);
		System.out.println(area); 
		
	}

}

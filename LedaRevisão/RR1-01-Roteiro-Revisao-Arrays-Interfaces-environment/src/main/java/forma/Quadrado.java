package forma;

public class Quadrado  {

	private double altura;
	private double largura;

	public Quadrado(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		
	}
	
	public void area(){
		
		double area = (largura * altura);
		System.out.println(area); 
		
	}

}

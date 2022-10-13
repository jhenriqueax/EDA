package forma;

import java.awt.geom.Area;

public class Triangulo{
	
	private double altura;
	private double largura;

	public Triangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		
	}
	
	public void area(){
		
		double area = (largura * altura) / 2;
		System.out.println(area); 
		
	}

}

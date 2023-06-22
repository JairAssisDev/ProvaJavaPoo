package prova2206;

public class Quadrado extends Forma {
	
	private double lado;
	
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double x =lado* 2;
		return x ;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
}

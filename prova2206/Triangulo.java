package prova2206;

public class Triangulo extends Forma {

	private double base;
	private double altura;
	
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double x =((base*altura)/2);
		return x ;	
		}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

}

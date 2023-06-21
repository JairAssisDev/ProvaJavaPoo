package provaJava;

public class Funcionario extends Pessoa {

	private String Cargo;
	private double salario;
	
	

	public Funcionario(String pessoa, int idade, String genero, String cargo, double salario) {
		super(pessoa, idade, genero);
		this.Cargo = cargo;
		this.salario = salario;
		
	}
	public Funcionario() {
		
	}
	
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String falar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

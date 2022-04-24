package br.unit.APS;

public class Funcionario {

	protected String nome;
	protected Double salario;
	protected int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double calcularBonificacao() {
		return this.salario = salario + (salario * 10/100);
		
	}
	
	@Override
	public String toString() {
		return "\t" + getClass().getSimpleName() + "\nID: " + this.getId() + "\nNome: " + this.getNome() + "\nSalario:" + this.getSalario() + 
				"\nSalario com bonificação: " + this.calcularBonificacao();
		
	}
	
}

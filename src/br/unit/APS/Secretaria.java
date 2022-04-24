package br.unit.APS;

public class Secretaria extends Funcionario {
	
	int ramal;
	
	public Secretaria(String nome, Double Salario, int ramal, int id) {
		
		super.setNome(nome);
		super.setSalario(Salario);
		this.ramal = 5000+ramal;
		super.setId(id);
	}
	
	public int getRamal() {
		return ramal;
		
	}
	public void setRamal(int ramal) {
		this.ramal = 50+ramal;
	}
	
	public String toString() {
		return "\t" + getClass().getSimpleName() + "\nID: " + super.getId() + "\nNome: " + this.getNome() + "\nSalario: R$ " + this.getSalario() + 
				"\nSalario com bonificação: " + this.calcularBonificacao() + "\nRamal: " + this.getRamal();
	
	}
}

package br.unit.APS;

public class Gerente extends Funcionario {

	String usuario = "COMLMET";
	int senha = 123;
	
	
	public Gerente(String nome, Double Salario, int id) {
		
		super.setNome(nome);
		super.setSalario(Salario);
		super.setId(id);

	}
	
	public int getSenha() {
		return senha;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	
	public double calcularBonificacao() {
		return this.salario = salario + (salario * 60/100);
	
	}
	
	public boolean autentica(String usuario, int senha) {
		if(this.senha == senha & this.usuario == usuario) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "\t" + getClass().getSimpleName() + "\nID: " + super.getId() + "\nNome: " + super.getNome() + "\nSalario: R$ " + super.getSalario() + 
				"\nSalario com bonificação: " + this.calcularBonificacao();
	
	}
}

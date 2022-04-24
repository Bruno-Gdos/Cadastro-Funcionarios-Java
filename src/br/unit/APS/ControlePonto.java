package br.unit.APS;
import java.util.Date;
import java.text.DateFormat;

public class ControlePonto {
	
	int id;
	String nome;
	String entrada;
	String saida;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSaida(String saida) {
		this.saida = saida;
	}
	
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
	
	
	public void RegistrarSaida() {
		
		Date saida = new Date();
		String dateToStr = DateFormat.getInstance().format(saida);
		setSaida(dateToStr);
		
	}
	
	public void RegistraEntrada(Funcionario f) {
		
		setId(f.getId());
		setNome(f.getNome());
		Date entrada = new Date();
		String dateToStr = DateFormat.getInstance().format(entrada);
		setEntrada(dateToStr);
		
	}
	
	@Override
	public String toString() {
		
		return "\tID: " + this.id + "\nNome: " + this.nome + "\nEntrada: " + this.entrada + "\nSaída: " + this.saida;
	}

}








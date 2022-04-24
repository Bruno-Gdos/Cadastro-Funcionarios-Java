package br.unit.APS;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	 public static void Menu(){
	        System.out.println("\tFunções");
	        System.out.println("[0] Encerra");
	        System.out.println("[1] Exibe Funções de Gerente");
	        System.out.println("[2] Exibe Funcionarios Cadastrados ");
	        System.out.println("[3] Cadastrar entrada ");
	        System.out.println("[4] Cadastrar Saída ");
	        System.out.println("[5] Exibe entrada e saída");
	        System.out.println("Opção:");
	 }
	 
	 public static void Menu2(){
	        System.out.println("\n\tFunções de gerente");
	        System.out.println("[0] Voltar");
	        System.out.println("[1] Cadastra Secretaria");
	        System.out.println("[2] Cadastra Gerente ");
	        System.out.println("Opção:");
	 }
	 
	
	 public static void FuncoesGerente() {
		 
		 System.out.println("Você entrou no método das funnções do gerente.");
		 
	 }
	 
 public static void ExibeFuncionarios() {
		 
		 System.out.println("Exibindo Funcionarios...");
		 
	 }
	
	public static void main(String[] args) {
		
		 Random random = new Random();
		 Scanner entrada = new Scanner(System.in);
	     int opcao;
	     int opcao2;
	     String usuario;
	     int senha;
	     ArrayList<Funcionario> lista = new ArrayList<>();   	 
	     ArrayList<ControlePonto> lista2 = new ArrayList<>();
	     Gerente g1 = new Gerente("MASTER",0.0,0);
	  
	     

	        do{

	            Menu();
	            opcao = Integer.parseInt(entrada.nextLine());
	            

	            switch(opcao){
	            

	            case 0:
	            	
	            	System.out.println("Obrigado!\n");
	            	break;
	            	
	            
	            case 1:
	            	FuncoesGerente();
	            	System.out.println("\nValidação de usuario");
	            	System.out.println("\nDigite o nome de usuario: ");
	            	usuario = entrada.nextLine();
	            	
	            	System.out.println("Digite a senha: ");
	            	senha = Integer.parseInt(entrada.nextLine());
	            	
	            	if(usuario.equals(g1.getUsuario()) & senha == g1.getSenha()) {
	            		usuario = g1.getUsuario();
	            		senha = g1.getSenha();
	            	}
	            	
	            	if(g1.autentica(usuario, senha) == true) {
	            		Menu2();
	            		opcao2 = Integer.parseInt(entrada.nextLine());
	            		switch(opcao2) {
	            		
	            		case 0:
	            			break;
	            			
	            		case 1:
	            			
	    	            	System.out.println("\nDigite o Nome");
	    	            	String nomeS = entrada.nextLine();
	    	            	
	    	            	System.out.println("\nDigite o Salario");
	    	            	Double salarioS = Double.parseDouble(entrada.nextLine());
	    	            	
	    	            	System.out.println("\nDigite o sufixo do Ramal");
	    	            	int ramal = Integer.parseInt(entrada.nextLine());
	    	            	
	    	            	int idS = random.nextInt(999)+1000;
	    	            	
	    	            	Secretaria secretaria = new Secretaria(nomeS, salarioS, ramal, idS);
	    	            	lista.add(secretaria);
	    	            	
	    	            	break;
	    	            	
	            		case 2:
	            			
	    	            	System.out.println("\nDigite o Nome");
	    	            	String nomeG = entrada.nextLine();
	    	            	
	    	            	System.out.println("\nDigite o Salario");
	    	            	Double salarioG = Double.parseDouble(entrada.nextLine());
	    	            	
	    	            	int idG = random.nextInt(999)+1000;
	    	            	
	    	            	Gerente gerente = new Gerente(nomeG, salarioG, idG);
	    	            	lista.add(gerente);
	    	            	break;
	    	            
	    	            default:
	    	            	System.out.println("OPÇÃO INVALIDA!");
	    	            
	    	            	
	            		}
	            		break;
	            	}else {
		            	System.out.println("LOGIN INVALIDO!");
		            	break;
	            	}
	            	
	            case 2:
	            	
	            	ExibeFuncionarios();
	            	
	            	System.out.println("\n");
	            	for(Funcionario i: lista) {
	            		System.out.println(i);
	            		System.out.println("\n");
	            		}
	            
	            	break;
	            	
	            case 3:
	            	int cont = 0;
	                System.out.println("\n");
	                System.out.println("Escolha o funcionario a ter a entrada cadastrada:");
	                System.out.println("\n");
	                
	                for(Funcionario i: lista) {
	            		
	            		
	            		System.out.println("["+cont+"] " + i.getNome() + "("+i.getId()+")");
	            		
	            		cont++;
	            		}
	            	System.out.println("\nQual o indice do funcionario? ");
	            	int escolha = Integer.parseInt(entrada.nextLine());
	            	ControlePonto ponto = new ControlePonto();
	            	ponto.RegistraEntrada(lista.get(escolha));
	            	lista2.add(ponto);
	            	
	            	break;
	            	
	            case 4:
	            	
	            	int cont2 = 0;
	                System.out.println("\n");
	                System.out.println("Escolha o funcionario a ter a saída cadastrada:");
	                System.out.println("\n");
	            	
	                for(ControlePonto i: lista2) {
	            		
	            		
	            		System.out.println("["+cont2+"] " + i.getNome() + "("+i.getId()+")");
	            		
	            		cont2++;
	            		}
	                
	            	System.out.println("\nQual o indice do funcionario? ");
	            	int escolha2 = Integer.parseInt(entrada.nextLine());
	                
	                lista2.get(escolha2).RegistrarSaida();
	                
	                break;
	                
	            case 5:
	            	
	            	System.out.println("\n");
	            	for(ControlePonto i: lista2) {
	            		System.out.println(i);
	            		System.out.println("\n");
	            		}
	            
	            	break;
	            	
	            default:
	                System.out.println("Opção inválida.");	
	            }
	        }while(opcao!= 0);
	      
	}
}

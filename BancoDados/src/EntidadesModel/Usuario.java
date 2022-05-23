package EntidadesModel;

import RegraDao.ClienteDAO;
import java.util.Scanner;

public class Usuario {
	Scanner scan = new Scanner(System.in);
	private String nomeUsuario;
	private String login;
	private String senha;
	private String senhaApp;
	
	

	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getSenhaApp() {
		return senhaApp;
	}


	public void setSenhaApp(String senhaApp) {
		this.senhaApp = senhaApp;
	}



	public void cadastroVerifica() {
		System.out.println("==========================================");
		System.out.println("Cadastro de usuário da clinica OdontoSmile\n"
				+ "[1] para cadastra Funcionário\n"
				+ "[2] para cadastra Paciente\n"
				+"=====================================================\n"
				+"Selecione umas das opçoes\n"
				+"OU tecle em qualquer tecla para SAIR do programa...\n"
				+"=====================================================");
		
	}
	public void efetuandoLogin() { 
		
		System.out.print("Informe LOGIN válido: ");
		login = scan.next();
		System.out.print("Insira SENHA válida: ");
		senha = scan.next();
	
	}
	
	public void verificadorLogin() {// verificando se o cliente já tem cadastro no bando de dados
		if ((getNomeUsuario() == login) && (getSenhaApp() == senha)) {	
			Scanner entrada = new Scanner(System.in);
		
			System.out.println("========= Bem Vindo a OdontoSmile =========");
			System.out.println("[1] Agendamento"
					          +"[2] Para SAIR");
			
			
			String esc = entrada.next();
			
			switch(esc) {
			
			case "1":
				Agendamento agendamento = new Agendamento();
				
				agendamento.agendamento();
				
				
			case "2":
				System.out.println("Obrigado por usar OdontoSmile!");
					if (esc.equals("2")) {
						break;
					}
			}
		}
		else {
			System.err.println("VOCE NAO POSSUI UM CADASTRO");
			cadastroVerifica();
		}
	}
	}



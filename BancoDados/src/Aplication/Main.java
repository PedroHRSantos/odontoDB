package Aplication;

import java.util.Scanner;

import EntidadesModel.Cliente;
import EntidadesModel.Funcionario;
import RegraDao.ClienteDAO;
import RegraDao.FuncionarioDAO;

import EntidadesModel.Usuario;
import EntidadesModel.Agendamento;
import EntidadesModel.FormaPagamento;
import EntidadesModel.Procedimento;


public class Main {
	
	public static void main(String[] args) {
		
		do {
		ClienteDAO clienteDao = new ClienteDAO();
		FuncionarioDAO fumDao = new FuncionarioDAO();
		
		Funcionario fumm = new Funcionario();
		Cliente cli = new Cliente();

		Scanner entrada = new Scanner(System.in);
		
		
		Usuario usuario = new Usuario();
		
		System.out.println("====== Tela inicial de Login =====");
		System.out.println("[1] Realizer Login \n[2] Realizer Cadastro");
		System.out.print("====== ===================== ===== \n>>");
		
		
		String realizarLogin = entrada.next();		
		if (realizarLogin.equals("1")) {
             usuario.efetuandoLogin();
			 usuario.verificadorLogin();

			
		}
		
		if (realizarLogin.equals("2")) {
			usuario.cadastroVerifica();
			
			
		}

			
		String pf = entrada.next(); //tecla de entrada para informar se será paciente ou funcionario de acordo com o menu
			
		
		while (!pf.equals("0")) {
				
			// FUNCIONÁRIO		
			if (pf.equals("1")) {
				if (true) { //primeiro cadastro de funcionário
					
					System.out.println("==== Dados Funcionario ====");
					System.out.println("Nome do Funcionario: ");
					fumm.setNomeFuncionario(entrada.nextLine());
					System.out.println("CPF: ");
					fumm.setCpf(entrada.nextInt());
					System.out.println("Endereço: ");
					fumm.setEndereco(entrada.nextLine());
					System.out.println("==== Cadastro Login ====");
					System.out.println("Email: ");
					fumm.setEmail(entrada.nextLine());
					System.out.println("Senha: ");
					fumm.setSenha(entrada.nextLine());
					
						
				}
				//visualização registro do bd
				for( Funcionario f: fumDao.getFuncionario()) {
					System.out.println("======== Cadastro Realizado ========");
					System.out.println("id: " + f.getIdFuncionario());
					System.out.println("Nome funcionario: " + f.getNomeFuncionario());
					System.out.println("funcao: " + f.getFuncao());
					System.out.println("salario: " + f.getSalario());
					System.out.println("cpf:  " + f.getCpf());
					System.out.println("endereço: " + f.getEndereco());
					System.out.println("------------------------------");
					System.out.println("Email: "+ f.getEmail());
					System.out.println("Senha: "+ f.getSenha());
					
				}
				System.out.println("-----------------------------------------------------------");
				System.out.println("Obrigado por cadastrar na OdontoSmile! O adiministrador irar"
						+"verificar sua conta que foi criada");
				System.out.println("Porfavor insira [Finalizar]");
				String continua = entrada.next();
					if (continua.equals("Finalizar")|| continua.equals("finalizar")) {
						break;
					}
				
			}
			// PACIENTE
			if (pf.equals("2")) { 
					if (true) {// primeiro cadastro do paciente
						
						System.out.println("==== Dados Paciente ====");

						
						System.out.println("Nome do paciente: ");
						cli.setNomeCliente(entrada.nextLine());
						
						System.out.println("CPF: ");
						cli.setCpf(entrada.nextLine());
						
						System.out.println("Endereço: ");
						cli.setEndereco(entrada.nextLine());
						
						System.out.println("==== Cadastro Login ====");
						System.out.println("Email: ");
						cli.setEmail(entrada.nextLine());
						
						System.out.println("Senha: ");
						cli.setSenha(entrada.nextLine());
					}
						//visualização registro do bd
							for( Cliente c: clienteDao.getCleinte()) {
								System.out.println("======== Cadastro Realizado ========");
								//System.out.println("id: " + c.getIdCliente());
								System.out.println("Nome funcionario: " + c.getNomeCliente());
								System.out.println("cpf:  " + c.getCpf());
								System.out.println("endereço: " + c.getEndereco());
								System.out.println("------------------------------");
								System.out.println("Email: "+ c.getEmail());
								System.out.println("Senha: "+ c.getSenha());
							}
					System.out.println("========= Bem Vindo a OdontoSmile =========");
					System.out.println("[1] Agendamento"
							          +"[2] Para SAIR");
					
					String esc = entrada.next();
					
					switch(esc) {
					
					case "1":
						Agendamento agendamento = new Agendamento();
						
						agendamento.agendamento();
						
						
					case "2":
						System.out.println("Obrigado por usar OdontoSmile");
							if (esc.equals("2")) {
								break;
							}
				

			}

			}else {
				System.out.print("Finalizando o programa... ");
				break;
			}
		
		//cli.informacaoCliente();
		//cli.setNomeCliente("pedro"); // add cliente individual
		//fumm.informacaoFuncionario();
		
		//clienteDao.save(cli); //salvando os dados no bd
		//fumDao.save(fumm); // salvando os dados no bd
		
		
		
		//Cliente cli2 = new Cliente();
		//cli2.setNomeCliente("ramos");
		
		//cli2.setIdCliente(1);
		//clienteDao.update(cli2);
		
		/*
		Funcionario fun2 = new Funcionario();
		fun2.setNomeFuncionario("barbosa");
		fun2.setIdFuncionario(2);
		fumDao.update(fun2);
		
		*/
		
		
		//clienteDao.deleteById(1);
		
		//fumDao.deleteByIdF(1);
		
		
		
		
		
		}
		
	}while(true);
	}
}

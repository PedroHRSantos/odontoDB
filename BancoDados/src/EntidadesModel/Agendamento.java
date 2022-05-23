package EntidadesModel;
import java.util.Scanner;

public class Agendamento {

	Scanner entrada = new Scanner(System.in);
	Procedimento proc = new Procedimento();
	
	public void agendamento() {
		
		System.out.println("===== Agendamento de consulta =====");
		System.out.println("--- DATA ---");
		System.out.println("Dia: ");
		String dia = entrada.next();
		System.out.println("Mes: ");
		String mes = entrada.next();		
		System.out.println("Ano: ");
		String ano = entrada.next();
		System.out.println("------------");		
		System.out.println(" Insira qual parte do dia voce quer para sua consulta "
				+ " a equipe OdontoSmile ira mandar uma mensagem/ligar"
				+ "para avisar o horario da sua consulta");
		System.out.println("------------");	
		System.out.println("[M] Manha"
						  +"[T] Tarde"
						  +"[N] Noite");
		String horario = entrada.next();
		
	if(horario.equals("M")|| horario.equals("m")) {

		System.out.println("======== Agendamento Completo ========");
		System.out.println("Dia: " + dia);
		System.out.println("Mes: " + mes);
		System.out.println("Mes: " + ano);
		System.out.println("------------------------------");
		System.out.println("Horario marcado para: Manha");
		System.out.println("------------------------------");
		
		System.out.println("Escolha qual o seu tipo de tratamento que deseja realizar\n"
				+ "[1] - Tratamento de Limpeza\n" 
				+ "[2] - Tratamento de Extracao\n"
				+ "[3] - Tratamento de Odontopediatria\n"
				+ "[4] - Tratamento de Ortodontia\n"
				+ "[5] - Tratamento de Restauracao\n"
				);
		proc.servico();
	}
		
	
	if(horario.equals("T")|| horario.equals("t")) {
		
		System.out.println("======== Agendamento Completo ========");
		System.out.println("Dia: " + dia);
		System.out.println("Mes: " + mes);
		System.out.println("Mes: " + ano);
		System.out.println("------------------------------");
		System.out.println("Horario marcado para: Tarde");
		System.out.println("------------------------------");

		
		System.out.println("Escolha qual o seu tipo de tratamento que deseja realizar\n"
				+ "[1] - Tratamento de Limpeza\n" 
				+ "[2] - Tratamento de Extracao\n"
				+ "[3] - Tratamento de Odontopediatria\n"
				+ "[4] - Tratamento de Ortodontia\n"
				+ "[5] - Tratamento de Restauracao\n"
				);
		proc.servico();
	}
		
	
	if(horario.equals("N")|| horario.equals("n")) {
		
		System.out.println("======== Agendamento Completo ========");
		System.out.println("Dia: " + dia);
		System.out.println("Mes: " + mes);
		System.out.println("Mes: " + ano);
		System.out.println("------------------------------");
		System.out.println("Horario marcado para: Noite");
		System.out.println("------------------------------");

		
		System.out.println("Escolha qual o seu tipo de tratamento que deseja realizar\n"
				+ "[1] - Tratamento de Limpeza\n" 
				+ "[2] - Tratamento de Extracao\n"
				+ "[3] - Tratamento de Odontopediatria\n"
				+ "[4] - Tratamento de Ortodontia\n"
				+ "[5] - Tratamento de Restauracao\n"
				);
		proc.servico();
	}
	}
	}
	
		



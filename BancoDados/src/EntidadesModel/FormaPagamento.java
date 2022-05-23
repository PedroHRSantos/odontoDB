package EntidadesModel;
import java.util.Scanner;

public class FormaPagamento {
	Scanner entrada = new Scanner(System.in);
	private String cartao;
	private String pix;
	
	
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public String getPix() {
		return pix;
	}
	public void setPix(String pix) {
		this.pix = pix;
	}
	
	public void formaPagamento() {

		
		System.out.println("======== Forma Pagamento ========");
		System.out.println("Escolha qual o seu tipo de tratamento que deseja realizar\n"
				+ "[1] - Cartao\n" 
				+ "[2] - Pix\n"
				);
		String formaPag = entrada.next();
		
		switch(formaPag) {
		
		case "1":
			
			System.out.println("======== Pagamento Cartao ========");
			System.out.println("Nome do Cartao: \n");
			String nomeCartao = entrada.next();
			System.out.println("CPF/CPNJ: \n");
			String cpfCartao = entrada.next();
			System.out.println("Numero do Cartao:");
			String numeroCartao = entrada.next();
			System.out.println("Validade: ");
			String validadeCartao = entrada.next();
			System.out.println("CVV: ");
			String cvvCartao = entrada.next();
			
			System.out.println("======== Pagamento com Sucesso ========");
			System.out.println("Porfavor insira [F] para finalizar");
			String continuac = entrada.next();
			if (continuac.equals("F")|| continuac.equals("f")) {
				break;
			}
			
			
		case "2":
			System.out.println("======== Pagamento Pix ========");
			System.out.println("Nome: \n");
			String nomePix= entrada.next();
			System.out.println("CPF: \n");
			String cpfPix = entrada.next();
			System.out.println("telefone:");
			String telePix = entrada.next();
			System.out.println("email: ");
			String emailPix = entrada.next();
			System.out.println("endereco: ");
			
			System.out.println("======== Pagamento com Sucesso ========");
			System.out.println("Porfavor insira [F] para finalizar");
			String continuap = entrada.next();
			if (continuap.equals("F")|| continuap.equals("f")) {
				break;
			}

}

	}
	
}

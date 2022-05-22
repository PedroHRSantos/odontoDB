package EntidadesModel;

import java.util.Date;
import java.util.Scanner;

public class Cliente {
	private int idCliente;
	private String nomeCliente;
	private int cpf;
	private String endereco;
	private Date dataNascimento;
	private String email;
	private String senha;
	
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	Scanner scan = new Scanner(System.in);
	public void informacaoCliente() {
		
		System.out.println("Nome do cliente");
		setNomeCliente(scan.next());
		
		System.out.println("cpf");
		setCpf(scan.nextInt());
		System.out.println("endereço");
		setEndereco(scan.next());
		//System.out.println("data de nascimento");
		//cli.setDataNascimento(scan.nextDate());
		System.out.println("email");
		setEmail(scan.next());
		System.out.println("senha");
		setSenha(scan.next());
		
	}
	
	
}

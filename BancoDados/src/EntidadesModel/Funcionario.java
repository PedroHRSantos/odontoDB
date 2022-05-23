package EntidadesModel;

import java.util.Date;
import java.util.Scanner;

public class Funcionario extends Usuario {
	private int idFuncionario;
	private String nomeFuncionario;
	private String funcao;
	private double salario;
	private int cpf;
	private String endereco;
	private Date dataNascimento;
	private String email;
	private String senha;
	
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
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
	
	/*
	Scanner scan = new Scanner(System.in);
	
	public void informacaoFuncionario() {
		System.out.println("Nome do Funcionario");
		setNomeFuncionario(scan.next());
		
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
	*/
	
}

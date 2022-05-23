package RegraDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EntidadesModel.Cliente;
import EntidadesModel.Funcionario;
import Factory.ConnectionFactory;

public class ClienteDAO {
	//Cliente cli = new Cliente();
	//Scanner scan = new Scanner(System.in);
	/*
	public void informacaoCliente() {
		System.out.println("Nome do cliente");
		cli.setNomeCliente(scan.next());
		
		System.out.println("cpf");
		cli.setCpf(scan.nextInt());
		System.out.println("endereço");
		cli.setEndereco(scan.next());
		//System.out.println("data de nascimento");
		//cli.setDataNascimento(scan.nextDate());
		System.out.println("email");
		cli.setEmail(scan.next());
		System.out.println("senha");
		cli.setSenha(scan.next());
		
	}
	
	*/
	
	public void save(Cliente cliente) {

		String sql = "INSERT INTO cliente(nomeCliente, cpf, endereco, email, senha) VALUES (?,?,?,?,?)";
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			// criar uma conexão com o bd
			conn = ConnectionFactory.createConnectionToMySQL();
			
			
			//adicionar os valores espereado pela query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, cliente.getNomeCliente());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getEndereco());
			//pstm.setDate(4, new Date(cliente.getDataNascimento().getTime()));
			pstm.setString(4, cliente.getEmail());
			pstm.setString (5, cliente.getSenha());
			
			//execultar a query
			pstm.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			//fechar as conexao
			
			try {
				if (pstm!= null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	
	public List<Cliente> getCleinte(){
		String sql = "SELECT * FROM cliente";
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//class que vai recuperar os dados do banco. comando selsct
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql); //captura o que foi executado
			
			rset = pstm.executeQuery();
			while (rset.next()) {
				Cliente cliente = new Cliente();
				
				//recuperear o id
				
				cliente.setIdCliente(rset.getInt("idCliente"));
				cliente.setNomeCliente(rset.getString("nomeCliente"));
				
				cliente.setCpf(rset.getString("cpf"));
				cliente.setEndereco(rset.getString("endereco"));
				//funcionario.setDataNascimento(rset.getDate("dataNascimento"));
				cliente.setEmail(rset.getString("email"));
				cliente.setSenha(rset.getString("senha"));
				
				clientes.add(cliente);
				
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}

	
	public void update(Cliente cliente) {
		String sql = "UPDATE cliente SET nomeCliente = ?, cpf = ?, endereco = ?, email = ?, senha = ? WHERE idCliente = ? ";
	
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			// criando a conexao
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//creinado para executar a query
			pstm = (PreparedStatement) conn.prepareCall(sql);
			
			//add os valores
			pstm.setString(1, cliente.getNomeCliente());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getEndereco());
			pstm.setString(4, cliente.getEmail());
			pstm.setString(5, cliente.getSenha());
			
			//qual o id do registro
			pstm.setInt(6, cliente.getIdCliente());
			
			
			//executar a quety
			
			pstm.execute();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(conn != null) {
					conn.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}

	
	public void deleteById(int id) {
		
		String sql = "DELETE FROM cliente WHERE idCliente = ?";
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

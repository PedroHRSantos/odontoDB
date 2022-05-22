package RegraDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EntidadesModel.Funcionario;
import Factory.ConnectionFactory;

public class FuncionarioDAO {
	
	

	
	public void save(Funcionario funcionario) {
		String sql = "INSERT INTO funcionario(nomeFuncionario, cpf, endereco, email, senha, salario, funcao) VALUES (?,?,?,?,?,?,?)";
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			// criar uma conexão com o bd
			conn = ConnectionFactory.createConnectionToMySQL();
			
			
			//adicoinar os valores espereado pela query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, funcionario.getNomeFuncionario());
			
			pstm.setInt(2, funcionario.getCpf());
			pstm.setString(3, funcionario.getEndereco());
			//pstm.setDate(4, new Date(funcionario.getDataNascimento().getTime()));
			pstm.setString(4, funcionario.getEmail());
			pstm.setString (5, funcionario.getSenha());
			pstm.setDouble(6, funcionario.getSalario());
			pstm.setString(7, funcionario.getFuncao());
			
			
			//execultar a quaryt
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

	public List<Funcionario> getFuncionario(){
		String sql = "SELECT * FROM funcionario";
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//class que vai recuperar os dados do banco. comando selsct
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql); //captura o que foi executado
			
			rset = pstm.executeQuery();
			while (rset.next()) {
				Funcionario funcionario = new Funcionario();
				
				//recuperear o id
				
				funcionario.setIdFuncionario(rset.getInt("idFuncionario"));
				funcionario.setNomeFuncionario(rset.getString("nomeFuncionario"));
				funcionario.setFuncao(rset.getString("funcao"));
				funcionario.setSalario(rset.getDouble("salario"));
				funcionario.setCpf(rset.getInt("cpf"));
				funcionario.setEndereco(rset.getString("endereco"));
				//funcionario.setDataNascimento(rset.getDate("dataNascimento"));
				funcionario.setEmail(rset.getString("email"));
				funcionario.setSenha(rset.getString("senha"));
				
				funcionarios.add(funcionario);
				
				
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
		return funcionarios;
	}

	public void update(Funcionario funcionario) {
		String sql = "UPDATE funcionario SET nomeFuncionario = ?, cpf = ?, endereco = ?, email = ?, senha = ? WHERE idFuncionario = ? ";
	
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			// criando a conexao
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//creinado para executar a query
			pstm = (PreparedStatement) conn.prepareCall(sql);
			
			//add os valores
			pstm.setString(1, funcionario.getNomeFuncionario());
			pstm.setInt(2, funcionario.getCpf());
			pstm.setString(3, funcionario.getEndereco());
			pstm.setString(4, funcionario.getEmail());
			pstm.setString(5, funcionario.getSenha());
			
			//qual o id do registro
			pstm.setInt(6, funcionario.getIdFuncionario());
			
			
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

	public void deleteByIdF(int id) {
		
		String sql = "DELETE FROM funcionario WHERE idFuncionario = ?";
		
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

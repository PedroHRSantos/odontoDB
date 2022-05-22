package Factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static final String USERNAME = "root"; //usuario do bd
	private static final String PASSWORD = "root";//SENHA DO DB
	private static final String DATABASE_URL = "jdbc:mysql://localhost/odonto_smile";//caminho do bd
	
	// conexão com o bd
	
	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); //faz com que a classa seja carregada pela jvm
		
		//conexção com db
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		// recuprear a conexão com o bando de dados
		
		Connection con = createConnectionToMySQL();
		
		if (con != null) {
			System.out.print("conexão como o bando de dados ");
			con.close();
		}
		
		
	}
	
	
}

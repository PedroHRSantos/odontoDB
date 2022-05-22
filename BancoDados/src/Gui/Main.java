package Gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Drive");
			Connection conexao = DriverManager.getConnection("jdbc:mysql:localhost/banco", "usuario", "senha");
			//ResulteSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
		}
		catch (ClassNotFoundException ex) {
			System.out.println("erro");
			
		}
		catch (SQLException ex) {
			System.out.println("ocorreu um erro");
		}
	}
}

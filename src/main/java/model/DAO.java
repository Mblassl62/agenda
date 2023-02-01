package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/**Modulo de Conexao**/
	//Parametros de conexao
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/bdagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "Mauricio@sl23";
	
	//metodos de conexao

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
	}catch (Exception e){
		System.out.println(e);
		return null;
	}
  }
	//Terste de Conexao
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
package ExpectionHandling9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Accout1 {

	
	public Connection getConn() throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/";
		String User="Abc";
		String password="code";
		
		Connection conn=null;
		conn=DriverManager.getConnection(url,User,password);
		return conn;
	}
	
	public void withdraw(int amount) throws SQLException {
		getConn();
	}
}

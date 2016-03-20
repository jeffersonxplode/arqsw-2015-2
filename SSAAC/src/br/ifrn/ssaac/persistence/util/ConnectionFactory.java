package br.ifrn.ssaac.persistence.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static ConnectionFactory factory = null;
	private Connection conn = null;
	
	private ConnectionFactory() {
		super();
	}
	public static ConnectionFactory getInstance() { 
		if (factory == null) {
			factory = new ConnectionFactory();
		}
		return factory;
	}
	
	public Connection getConnection() {
		if (conn == null) {
			try{
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ssaac", "postgres", "123123");
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace(); 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}

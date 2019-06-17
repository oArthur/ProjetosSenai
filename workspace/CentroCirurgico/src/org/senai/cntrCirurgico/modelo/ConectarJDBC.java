package org.senai.cntrCirurgico.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarJDBC {
	
	public Connection getConectar() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/centro_cirurgico","root","");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao conectar.");
			return null;
		}
		
	}

}

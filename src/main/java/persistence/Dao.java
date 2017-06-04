package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JRField;

public class Dao {

	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	public void open()throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste","root","config");
		
	}
	
	public void close() throws Exception{
		con.close();
	}
	
	
}

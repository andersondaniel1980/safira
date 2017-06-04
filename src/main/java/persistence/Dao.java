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
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/safira","root","config");
		
	}
	
	public void close() throws Exception{
		con.close();
	}
	
	public void criarConexao()throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/safira","root","config");
	}
	
	
	public Dao() {
		// TODO Auto-generated constructor stub
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public PreparedStatement getStmt() {
		return stmt;
	}

	public void setStmt(PreparedStatement stmt) {
		this.stmt = stmt;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	
	
}

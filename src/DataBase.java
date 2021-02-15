package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {

	protected Connection con;

	private String url;
	private String user;
	private String pass;

	public DataBase() throws Exception {
		con = null;
		url = "jdbc:mysql : //localhost:3306/email";
		user = "root";
		pass = "";
		con = DriverManager.getConnection(url, user, pass);
	}

}
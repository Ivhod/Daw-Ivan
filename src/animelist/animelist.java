package animelist;

import java.sql.ResultSet;
import java.sql.Statement;

import objetosDB.User;

public class animelist extends DataBase {
	Statement stm;
	public animelist() throws Exception {
		this.stm = this.con.createStatement();
	}
	
	
	public User getUser(String name, String pass) throws Exception {
		User u = null;
		String sql = "Select * from usuarios where usuario ='" + name + "' and pass = '" + pass + "'";

		ResultSet result = this.stm.executeQuery(sql);
		if (result.next())
			u = new User(result.getInt("id_usuario"), result.getString("usuario"), result.getString("Pass"));
		return u;
	}
	public boolean newUser(String name, String pass) throws Exception{
		String sql = "Insert into usuarios(usuario,pass) values ('"+name+"','"+pass+"')";
		try {
		this.stm.executeUpdate(sql);
		return true;
		}
		catch(Exception ex) {
			return false;
		}
	}
}

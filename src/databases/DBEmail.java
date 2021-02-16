package databases;

import objetos.User;
import objetos.Messages;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBEmail extends DataBase { // base de datos email.

	Statement stm;

	public DBEmail() throws Exception {
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
	
	public Messages getMessage(String name, String pass) throws Exception{
		Messages m = null;
		String sql = "Select m.* from usuarios u, mensajes m where usuario ='" + name + "' and pass = '" + pass + "'"; 
		ResultSet result = this.stm.executeQuery(sql);
		while (result.next())
			m = new Messages( result.getString("texto"), result.getInt("id_remite"), result.getInt("id_destino"), result.getBoolean("nuevo"));
		
		return m;
	}
	
}

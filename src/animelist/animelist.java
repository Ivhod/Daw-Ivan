package animelist;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
	public User getUserById(int id)  throws Exception {
		User u = null;
		String sql ="Select * from usuarios where id_usuario ='"+id+"'";
		
		ResultSet result = this.stm.executeQuery(sql);
		if (result.next())
			u = new User(result.getInt("id_usuario"), result.getString("usuario"),result.getString("Pass"));
		return u;
	}
	public ArrayList<String> getAnime(User u) throws Exception{
		ArrayList<String> animes = new ArrayList<String>();
		String sql = "SELECT name FROM animes WHERE id_anime IN( SELECT id_anime FROM usu_ani WHERE id_usuario=" + u.getId()+")";
		ResultSet result = this.stm.executeQuery(sql);
		while (result.next()) {
			animes.add(result.getString("name"));
		
		}
		return animes;
	
}
}

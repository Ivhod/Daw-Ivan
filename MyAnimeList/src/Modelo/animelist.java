package Modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.User;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class animelist extends DataBase {
	Statement stm;
	public animelist() throws Exception {
		this.stm = this.con.createStatement();
	}
	
	
	public User getUser(String nombre, String password) throws Exception {
		User u = null;
		String sql = "Select * from usuarios where usuario ='" + nombre + "' and pass = '" + password + "'";

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
	public boolean newAnime(String name, String gender)  throws Exception {
		String sql= "insert into animes(name,gender) values ('"+name+"','"+gender+"')";
		try{
			this.stm.executeUpdate(sql);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}
	
	public boolean newAnimeUsuario(int id_usuario , int id_anime)  throws Exception {
		String sql= "insert into usu_ani (id_usuario,id_anime) values ('"+id_usuario+"','"+id_anime+"')";
		try{
			this.stm.executeUpdate(sql);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}
	//INSERT INTO `usu_ani` (`usu_ani_id`, `id_usuario`, `id_anime`) VALUES (NULL, '1', '5');
	
	
}
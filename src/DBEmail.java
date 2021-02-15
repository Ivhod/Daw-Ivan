package databases;

import objetosDB.User;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBEmail extends DataBase {

	Statement stm;

	public DBEmail() throws Exception {
		this.stm = this.con.createStatement();
	}

	public User getUser(String name, String pass) throws Exception {
		User u = null;
		String sql = "Select * from usuarios where usuario= '" + name + "'and pass = '" + pass + "'";
		
		ResultSet result = this.stm.executeQuery(sql);
		if (result.next())
			u = new User(result.getInt("id_usuario"), result.getString("usuario"), result.getString("pass"));

		return u;
	}
}

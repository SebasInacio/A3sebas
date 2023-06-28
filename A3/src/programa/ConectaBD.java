package programa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
public class ConectaBD {
	
	public Connection conectaBD() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost/a3database?user=root&password=SqlSebas@123456";
			conn = DriverManager.getConnection(url);
		
		
		
		}
			
			catch (SQLException erro) {
				JOptionPane.showMessageDialog(null, erro.getMessage());
			}
		
		
		return null;
	}

}

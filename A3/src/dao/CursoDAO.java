package dao;

import java.sql.*;

import javax.swing.JOptionPane;


public class CursoDAO {
	public ResultSet listarCurso() {
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "SELECT * FROM curso ORDER BY nome_curso;";
		
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			return pstm.executeQuery();
			
		} catch (SQLException e) {JOptionPane.showMessageDialog(null, e.getMessage());
		return null;
			// TODO: handle exception
		}
		
	}
	
	
	
	

}

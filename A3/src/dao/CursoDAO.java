package dao;

import java.sql.*;

import javax.swing.JOptionPane;


public class CursoDAO {

	public ResultSet listarCurso() {
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "SELECT nome_curso FROM cursos ORDER BY nome_curso;";//seleciona a coluna de nome_curso no banco de dados

		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			return pstm.executeQuery();

		} catch (SQLException e) {JOptionPane.showMessageDialog(null, e.getMessage());
		return null;
		}

	}
	
	
	
	

}

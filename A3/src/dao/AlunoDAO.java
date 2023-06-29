package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dto.AlunoDTO;

public class AlunoDAO {
	
	Connection conn;
	
	public ResultSet autenticacaoAluno(AlunoDTO objAlunoDTO) {
		
		conn = new ConexaoDAO().conectaBD();
		
		try {
			String sql = "";
			
		} catch (SQLException erro) {
			
			JOptionPane.showMessageDialog(null, "AlunoDAO: " + erro);
		
		}
	}

}

package dao;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import dto.*;

public class CursoDAO {

	public ArrayList<CursoDTO> listarCurso() {
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "SELECT nome_curso, idCurso FROM cursos ORDER BY idCurso;";//seleciona a coluna de nome_curso no banco de dados

		try 
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs;
			rs = pstm.executeQuery();
			ArrayList<CursoDTO> lista = new ArrayList<>(); //monta a lista para 
			//enquanto ouver dados na proxima linha ele puxa o dado
			while(rs.next()) 
			{
				CursoDTO objCursoDTO = new CursoDTO();
				objCursoDTO.setIdCurso(rs.getInt("idCurso"));//acessando o obj e setando no objto um id
				objCursoDTO.setNome(rs.getString("nome_curso"));
				
				lista.add(objCursoDTO);
			}
			return lista;	
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
			return null;
		}

	}
	
	
	
	

}

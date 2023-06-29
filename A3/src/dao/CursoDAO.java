package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import dto.*;

public class CursoDAO {

	PreparedStatement pstm;
	ResultSet rs;
	
	public void cadastrarCurso(CursoDTO objCursoDTO) {
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "INSERT INTO a3database.cursos (nome_curso, duracao_curso, descricao_curso) VALUES (?, ?, ?);" ;
		
		try { 
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, objCursoDTO.getNome());
			pstm.setString(2, objCursoDTO.getDuracao());
			pstm.setString(3, objCursoDTO.getDescricao());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Cadatrar Curso" + erro);
			
		}
		
		
		
	}
	
	
	
	
	public ArrayList<CursoDTO> listarCurso() {
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "SELECT nome_curso, idCurso, duracao_curso FROM cursos ORDER BY idCurso;";//seleciona a coluna de nome_curso no banco de dados

		try 
		{
			 pstm = conn.prepareStatement(sql);
			
			rs = pstm.executeQuery();
			ArrayList<CursoDTO> lista = new ArrayList<>(); //monta a lista para 
			//enquanto ouver dados na proxima linha ele puxa o dado
			while(rs.next()) 
			{
				CursoDTO objCursoDTO = new CursoDTO();
				objCursoDTO.setIdCurso(rs.getInt("idCurso"));//acessando o obj e setando no objto um id
				objCursoDTO.setNome(rs.getString("nome_curso"));
				objCursoDTO.setDuracao(rs.getString("duracao_curso"));
				
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

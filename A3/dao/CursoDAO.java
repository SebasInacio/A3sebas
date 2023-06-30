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
	
	
	
	//cria uma array list e armazena os dados do banco dentro dela
	public ArrayList<CursoDTO> listarCurso() {
		Connection conn = new ConexaoDAO().conectaBD();
		
		//obj que armazena o comando para fazer o select no banco de dados
		String sql = "SELECT nome_curso, idCurso, duracao_curso FROM cursos ORDER BY idCurso;";

		try 
		{
			//prepara o comando usando o obj que armazena como argumento
			 pstm = conn.prepareStatement(sql);
			 
			//executa o comando
			rs = pstm.executeQuery();
			ArrayList<CursoDTO> lista = new ArrayList<>(); 
			
			//enquanto houverem dados ele ira repetir
			while(rs.next()) 
			{
				//acessando o obj e armazenando dados nesse objeto
				CursoDTO objCursoDTO = new CursoDTO();
				objCursoDTO.setIdCurso(rs.getInt("idCurso"));
				objCursoDTO.setNome(rs.getString("nome_curso"));
				objCursoDTO.setDuracao(rs.getString("duracao_curso"));
				
				lista.add(objCursoDTO);//adicionando o obj na arraylist
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

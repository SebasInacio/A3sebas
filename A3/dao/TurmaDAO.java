package dao;
import dto.*;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TurmaDAO {
	
	PreparedStatement pstm;
	ResultSet rs;
	
	public void cadastrarTurma(TurmaDTO objTurmaDTO) {
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "INSERT INTO a3database.cursos (numAlunos, idCurso_cursos, idSala_salas) VALUES (?, ?, ?);" ;
		
		try { 
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, objTurmaDTO.getNumAlunos());
			pstm.setInt(2, objTurmaDTO.getIdCurso());
			pstm.setInt(3, objTurmaDTO.getIdSala());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Cadatrar Turma" + erro);
			
		}
	}
	
	
	
	//cria uma array list e armazena os dados do banco dentro dela
	public ArrayList<TurmaDTO> listarTurma() {
		Connection conn = new ConexaoDAO().conectaBD();
		
		//obj que armazena o comando para fazer o select no banco de dados
		String sql = "SELECT numAlunos, idCurso_cursos, idSala_salas FROM turmas ORDER BY idTurma;"; 

		try 
		{
			//prepara o comando usando o obj que armazena como argumento
			 pstm = conn.prepareStatement(sql);
			 
			//executa o comando
			rs = pstm.executeQuery();
			ArrayList<TurmaDTO>  lista = new ArrayList<>(); 
			
			//enquanto houverem dados ele ira repetir
			while(rs.next()) 
			{
				//acessando o obj e armazenando dados nesse objeto
				TurmaDTO objTurmaDTO = new TurmaDTO();
				
				
				lista.add(objTurmaDTO);//adicionando o obj na arraylist
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
package dao;
import dto.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.AlunoDTO;

public class ProfessorDAO {
	PreparedStatement pstm;
	ResultSet rs;

	public void cadastrarProfessor(ProfessorDTO objProfessorDTO) {
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "INSERT INTO a3database.professores (nome_professor, sobrenome_professor, cpf_professor, celular_professor, email_professor, bairro_professor, rua_professor, numero_professor) VALUES (?, ?, ?, ?, ?, ?, ? ,? );" ;
		
		try { 
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, objProfessorDTO.getNome());
			pstm.setString(2, objProfessorDTO.getSobrenome());
			pstm.setString(3, objProfessorDTO.getCpf());
			pstm.setString(4, objProfessorDTO.getCelular());
			pstm.setString(5, objProfessorDTO.getEmail());
			pstm.setString(6, objProfessorDTO.getBairro());
			pstm.setString(7, objProfessorDTO.getRua());
			pstm.setString(8, objProfessorDTO.getNumero());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Cadatrar Curso" + erro);
			
		}
	}
	
	
	
	
	public ArrayList<ProfessorDTO> listarProfessor() {
		
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "SELECT idProfessor, nome_professor, sobrenome_professor, cpf_professor, celular_professor, email_professor, curso_professor FROM professores ORDER BY idProfessor";
		try 
		{
			pstm = conn.prepareStatement(sql);
			
			rs = pstm.executeQuery();
			ArrayList<ProfessorDTO> lista = new ArrayList<>();
			
			//enquanto ouver dados na proxima linha ele puxa o dado
			while(rs.next()) 
			{ 
				ProfessorDTO objProfessorDTO = new ProfessorDTO();
				objProfessorDTO.setIdProfessor(0);
				objProfessorDTO.setNome(rs.getString("nome_professor"));
				objProfessorDTO.setSobrenome(rs.getString("sobrenome_professor"));
				objProfessorDTO.setCpf(rs.getString("cpf_professor"));
				objProfessorDTO.setCelular(rs.getString("celular_professor"));
				objProfessorDTO.setEmail(rs.getString("email_professor"));
				objProfessorDTO.setIdCurso(rs.getInt("curso_professor"));
				lista.add(objProfessorDTO);
			}
			return lista;
		}
		catch (SQLException erro)
		{
			JOptionPane.showMessageDialog(null, "ProfessorDAO: " + erro);
			return null;
		}
		
		
	}



}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.AlunoDTO;
import dto.CursoDTO;

public class AlunoDAO {
	PreparedStatement pstm;
	ResultSet rs;
	Connection conn;
	
	public ArrayList<AlunoDTO> listarAluno() {
		
		conn = new ConexaoDAO().conectaBD();
		ArrayList<AlunoDTO> lista = new ArrayList<>();
		try 
		{
			String sql = "SELECT nome_aluno, sobrenome_aluno, cpf_aluno, celular_aluno, email_aluno, curso_aluno FROM alunos ORDER BY idAluno";
			rs = pstm.executeQuery();
			//enquanto ouver dados na proxima linha ele puxa o dado
			while(rs.next()) 
			{
				AlunoDTO objAlunoDTO = new AlunoDTO();
				objAlunoDTO.setNome(rs.getString("nome_aluno"));
				objAlunoDTO.setSobrenome(rs.getString("sobrenome_aluno"));
				objAlunoDTO.setCpf(rs.getString("cpf_aluno"));
				objAlunoDTO.setCelular(rs.getString("celular_aluno"));
				objAlunoDTO.setEmail(rs.getString("email_aluno"));
				objAlunoDTO.set
				lista.add(objAlunoDTO);
			}
			return lista;
		}
		catch (SQLException erro)
		{
			JOptionPane.showMessageDialog(null, "AlunoDAO: " + erro);
			return null;
		}
		
		
	}

}

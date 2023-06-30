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

	public void cadastrarAluno(AlunoDTO objAlunoDTO) {
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "INSERT INTO a3database.alunos (nome_aluno, sobrenome_aluno, cpf_aluno, celular_aluno, email_aluno, bairro_aluno, rua_aluno, numero_aluno) VALUES (?, ?, ?, ?, ?, ?, ? ,? );" ;
		
		try { 
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, objAlunoDTO.getNome());
			pstm.setString(2, objAlunoDTO.getSobrenome());
			pstm.setString(3, objAlunoDTO.getCpf());
			pstm.setString(4, objAlunoDTO.getCelular());
			pstm.setString(5, objAlunoDTO.getEmail());
			pstm.setString(6, objAlunoDTO.getBairro());
			pstm.setString(7, objAlunoDTO.getRua());
			pstm.setString(8, objAlunoDTO.getNumeroCasa());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Cadatrar Curso" + erro);
			
		}
	}
	
	
	
	
	public ArrayList<AlunoDTO> listarAluno() {
		
		Connection conn = new ConexaoDAO().conectaBD();
		String sql = "SELECT idAluno, nome_aluno, sobrenome_aluno, cpf_aluno, celular_aluno, email_aluno, curso_aluno FROM alunos ORDER BY idAluno";
		try 
		{
			pstm = conn.prepareStatement(sql);
			
			rs = pstm.executeQuery();
			ArrayList<AlunoDTO> lista = new ArrayList<>();
			
			//enquanto ouver dados na proxima linha ele puxa o dado
			while(rs.next()) 
			{
				AlunoDTO objAlunoDTO = new AlunoDTO();
				objAlunoDTO.setIdAluno(rs.getInt("idAluno"));
				objAlunoDTO.setNome(rs.getString("nome_aluno"));
				objAlunoDTO.setSobrenome(rs.getString("sobrenome_aluno"));
				objAlunoDTO.setCpf(rs.getString("cpf_aluno"));
				objAlunoDTO.setCelular(rs.getString("celular_aluno"));
				objAlunoDTO.setEmail(rs.getString("email_aluno"));
				objAlunoDTO.setIdCurso(rs.getInt("curso_aluno"));
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

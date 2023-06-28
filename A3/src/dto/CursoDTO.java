package dto;


public class CursoDTO {

	
	int idCurso;
	String nome, descricao, cargaHoraria;
	int contador = 1;
	
	
	public CursoDTO( String cargaHoraria, String nome, String descricao) {
		this.cargaHoraria = cargaHoraria;
		this.idCurso = contador;
		this.descricao = descricao;
		this.nome = nome;
		contador++;
	}
	
	public CursoDTO() {
	}

	public static CursoDTO cadastrarCurso(String cargaHoraria2, String nome, String descricao) {
		return new CursoDTO(cargaHoraria2, nome, descricao);
	}
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int codCurso) {
		this.idCurso = codCurso;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}

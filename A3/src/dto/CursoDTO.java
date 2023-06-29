package dto;


public class CursoDTO {

	
	int idCurso;
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	String nome, descricao, duracao;
	
	
	public CursoDTO( String nome, String duracao, String descricao) {
		this.duracao = duracao;
		this.descricao = descricao;
		this.nome = nome;
	}
	
	public CursoDTO() {
	}

	public static CursoDTO cadastrarCurso(String nome, String duracao, String descricao) {
		return new CursoDTO(nome, duracao, descricao);
	}
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int codCurso) {
		this.idCurso = codCurso;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.duracao = cargaHoraria;
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

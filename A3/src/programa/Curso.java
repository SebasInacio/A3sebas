package programa;


public class Curso {

	
	int codCurso;
	String nome, descricao, cargaHoraria;
	int contador = 1;
	
	
	public Curso( String cargaHoraria, String nome, String descricao) {
		this.cargaHoraria = cargaHoraria;
		this.codCurso = contador;
		this.descricao = descricao;
		this.nome = nome;
		contador++;
	}
	
	public Curso() {
	}

	public static Curso cadastrarCurso(String cargaHoraria2, String nome, String descricao) {
		return new Curso(cargaHoraria2, nome, descricao);
	}
	
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
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

package dto;

public class ProfessorDTO {

	private String nome, sobrenome, cpf, celular, email, bairro, rua, numero;
	private int idProfessor;
	
	
	
	
	public ProfessorDTO(String nome, String sobrenome, String cpf, String celular, String email, String bairro,
			String rua, String numero) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.celular = celular;
		this.email = email;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}



	public int getIdProfessor() {
		return idProfessor;
	}


	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
}

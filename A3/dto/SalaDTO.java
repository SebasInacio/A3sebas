package dto;

public class SalaDTO {

	private String nomeSala, corredor, andar;
	private int idSala;

	public SalaDTO(String andar, String corredor, String sala) {
		
		this.nomeSala = sala;
		this.corredor = corredor;
		this.andar = andar;
		

	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getSala() {
		return nomeSala;
	}

	public void setSala(String sala) {
		this.nomeSala = sala;
	}

	public String getCorredor() {
		return corredor;
	}

	public void setCorredor(String corredor) {
		this.corredor = corredor;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}
	
	
	
}

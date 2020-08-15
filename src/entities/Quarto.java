package entities;

public class Quarto {
	private String nomeHospede;
	private String emailHospede;

	public Quarto(String nomeHospede, String emailHospede) {
		this.nomeHospede = nomeHospede;
		this.emailHospede = emailHospede;
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public String getEmailHospede() {
		return emailHospede;
	}

	public void setEmailHospede(String emailHospede) {
		this.emailHospede = emailHospede;
	}
	
	@Override
	public String toString() {		
		return nomeHospede + ", " + emailHospede;
	}
}

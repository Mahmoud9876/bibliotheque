package Model;

public class Utilisateur {
	private int idU;
	private String nomU;
	private String prenomU;
    private String email;
    private String mdp;
	
    public int getIdU() {
		return idU;
	}
	public void setIdU(int idU) {
		this.idU = idU;
	}
	public String getNomU() {
		return nomU;
	}
	public void setNomU(String nomU) {
		this.nomU = nomU;
	}
	public String getPrenomU() {
		return prenomU;
	}
	public void setPrenomU(String prenomU) {
		this.prenomU = prenomU;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
    
    
}

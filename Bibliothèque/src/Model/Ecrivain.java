package Model;

public class Ecrivain {

	private Integer idE;
	private String nomE;
	private String prenomE;
	private String nationalite;
	   
	public Ecrivain(Integer idE, String nomE, String prenomE, String nationalite) {
		this.idE = idE;
		this.nomE = nomE;
		this.prenomE = prenomE;
		this.nationalite = nationalite;
	}
	
	public Ecrivain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdE() {
		return idE;
	}
	public void setIdE(Integer idE) {
		this.idE = idE;
	}
	public String getNomE() {
		return nomE;
	}
	public void setNomE(String nomE) {
		this.nomE = nomE;
	}
	public String getPrenomE() {
		return prenomE;
	}
	public void setPrenomE(String prenomE) {
		this.prenomE = prenomE;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	   

}

package Model;

public class Livre {
		
	private Integer idL;
    private String titreL;
    private Ecrivain ecrivain;
	   
  

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livre(Integer idL, String titreL, Ecrivain ecrivain) {
		this.idL = idL;
		this.titreL = titreL;
		this.ecrivain = ecrivain;
	}

	public Integer getIdL() {
    	return idL;
    }

	public void setIdL(Integer newIdL) {
	   idL = newIdL;
	}
	   
	public String getTitreL() {
	    return titreL;
	}
	   
	public void setTitreL(String newTitreL) {
	    titreL = newTitreL;
	}
	   
	public Ecrivain getEcrivain() {
		return ecrivain;
	}
	   
	public void setEcrivain(Ecrivain newEcrivain) {
		ecrivain = newEcrivain;
	}
}

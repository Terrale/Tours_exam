package Main;

public class Admin extends FenetreConnexion {
	private String id;
	private String mdp;
	
	public Admin() {
		this.id = super.getIdchaine();
		this.mdp = super.getMdpchaine();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

}

package Main;

public abstract class Utilisateur {
	private String id;
	private String mdp;
	FenetreConnexion fen;
	
	public Utilisateur() {
		this.id = fen.getIdchaine();
		this.mdp = fen.getMdpchaine();
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

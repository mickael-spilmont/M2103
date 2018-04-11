package tpModelisationObjet;

public class PosteTravail extends Assemblage {
	String utilisateur;
	
	public PosteTravail(String nom, String utililisateur) {
		super(nom);
		this.utilisateur = utililisateur;
	}
	
	public PosteTravail(String nom) {
		super(nom);
	}

	public String getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Utilisateur : ").append(utilisateur).append("\n").append(super.toString());
		return chaine.toString();
	}
}

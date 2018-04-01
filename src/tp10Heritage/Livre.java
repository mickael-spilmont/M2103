package tp10Heritage;

public class Livre extends Document {
	private String titre;
	private String auteur;
	private String editeur;
	private int annee;
	
	public Livre(String cote,String titre,String auteur, String editeur, int annee) {
		super(cote);
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee = annee;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTitre : " + titre + "\nAuteur : " + auteur + "\nEditeur : " + editeur + "\nAnnée : " + annee + "\n";
	}
}

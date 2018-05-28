package tp10Heritage;

import java.io.Serializable;

public class DVD extends Document implements Serializable{
	private String titre;
	private String realisateur;
	private int duree;

	public DVD(String cote,String titre, String realisateur, int duree) {
		super(cote);
		this.titre = titre;
		this.realisateur = realisateur;
		this.duree = duree;
	}
	
	@Override
	public int dureeEmprunt() {
		return 5;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTitre : " + titre + "\nRealisateur : " + realisateur + "\nDurée : " + duree + "\n";
	}
}

package tpModelisationObjet;

import java.util.ArrayList;

public abstract class Assemblage {
	private String nom;
	private ArrayList<Assemblable> assemblables;
	
	public Assemblage(String nom) {
		this.nom = nom;
		assemblables = new ArrayList<>();
	}
	
	public boolean add(Assemblable assemblable) {
		return assemblables.add(assemblable);
	}
	
	public boolean remove(Assemblable assemblable) {
		return assemblables.remove(assemblable);
	}

	public String getNom() {
		return nom;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append(nom).append(" :\n");
		for (Assemblable assemblable : assemblables){
			chaine.append(assemblable);
		}
		chaine.append("\n");
		return chaine.toString();
	}
}

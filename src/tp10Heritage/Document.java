package tp10Heritage;

import java.io.Serializable;
import java.time.LocalDate;

public class Document implements Serializable {
	private final String cote;
	private int numEmprunteur;
	private LocalDate dateEmprunt;
	
	public Document(String cote) {
		this.cote = cote;
	}
	
	public String getCote() {
		return cote;
	}

	public int getNumEmprunteur() {
		return numEmprunteur;
	}

	public int dureeEmprunt() {
		return 15;
	}
	
	public void emprunter(int numEmprunteur, LocalDate date) {
		this.numEmprunteur = numEmprunteur;
		this.dateEmprunt = date;
	}
	
	public void emprunter(int numEmprunteur) {
		this.emprunter(numEmprunteur, LocalDate.now());
	}
	
	public void restitutuer() {
		this.numEmprunteur = 0;
		this.dateEmprunt = null;
	}
	
	public LocalDate dateRetour() {
		return this.dateEmprunt;
	}

	public boolean equals(Document autre) {
		return (this.cote.equals(autre.cote));
	}
	
	public boolean equals(String cote) {
		return (this.cote.equals(cote));
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Document)
			return this.equals((Document)obj);
		else if (obj != null && obj instanceof String) {
			return this.equals((String)obj);
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Côte : " + cote;
	}
}

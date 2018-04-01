package tp10Heritage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mediatheque {
	ArrayList<Document> documents;
	
	public Mediatheque() {
		documents = new ArrayList<>();
	}
	
	public boolean ajouterDocument(Document document) {
		if (documents.contains(document))
			return false;
		else {
			documents.add(document);
			return true;
		}
	}
	
	/**
	 * cherche si un document possédant la cote donnée est présent, retourne son indice si c'est le cas, et -1 dans le cas contraire
	 * @param cote
	 * @return
	 */
	private int indexOf(String cote) {
		int indice = 0;
		for (Document doc : documents) {
			if (doc.equals(cote)) {
				return indice;
			}
			indice++;
		}
		return -1;
	}
	
	public Document obtenir(String cote) {
		int indice = indexOf(cote);
		if (indice >= 0) {
			return documents.get(indice);
		}
		return null;
	}
	
	public boolean emprunter(String cote, int numEmprunteur, LocalDate date) {
		int indice = indexOf(cote);
		
		if (indice >= 0 && documents.get(indice).getNumEmprunteur() == 0) {
			documents.get(indice).emprunter(numEmprunteur, date);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean emprunter(String cote, int numEmprunteur) {
		return this.emprunter(cote, numEmprunteur, LocalDate.now());
	}
	
	public boolean restitutuer(String cote) {
		int indice = indexOf(cote);
		
		if (indice >= 0 && documents.get(indice).getNumEmprunteur() > 0) {
			documents.get(indice).restitutuer();
			return true;
		}
		else {
			return false;
		}
	}
}

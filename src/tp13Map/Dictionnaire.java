package tp13Map;

import java.util.HashMap;
import java.util.Map;

public class Dictionnaire {
	Map<String, String> dico;
	
	public Dictionnaire() {
		dico = new HashMap<>();
	}
	
	public Dictionnaire(String francais[], String anglais[]) {
		dico = new HashMap<>();
		for (int i = 0 ; i < francais.length ; i++) {
			this.ajouter(francais[i], anglais[i]);
		}
	}
	
	public void ajouter(String francais, String anglais) {
		dico.put(francais, anglais);
	}
	
	public void supprimer(String mot) {
		dico.remove(mot);
	}
	
	public String traduction(String mot) {
		return dico.get(mot);
	}	
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		for (String francais : dico.keySet()) {
			chaine.append(francais).append(" : ").append(traduction(francais)).append("\n");
		}
		
		return chaine.toString();
	}
	
	public String toStringV2() {
		StringBuilder chaine = new StringBuilder();
		for (Map.Entry<String, String> entree : dico.entrySet()) {
			chaine.append(entree.getKey()).append(" : ").append(entree.getValue()).append("\n");
		}
		return chaine.toString();
	}
}

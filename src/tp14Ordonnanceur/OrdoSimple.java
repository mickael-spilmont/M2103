package tp14Ordonnanceur;

import outils.Fifo;

public class OrdoSimple implements Ordonnanceur {
	private Fifo<Tache> file;
	
	public OrdoSimple() {
		file = new Fifo<>();
	}
	
	public void entrer(Tache tache) {
		file.ajouter(tache);
	}
	
	public Tache sortie() {
		if (!this.estVide())
			return file.suppression();
		else
			return null;
	}
	
	public boolean estVide() {
		return file.estVide();
	}
	
	@Override
	public String toString() {
		return file.toString();
	}
}

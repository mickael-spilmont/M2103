package tp14Ordonnanceur;

public class OrdoAvecPriorite implements Ordonnanceur {
	private OrdoSimple[] files;
	
	public OrdoAvecPriorite(int nbPriorites) {
		files = new OrdoSimple[nbPriorites];

		for (int i = 0 ; i < files.length ; i++){
			files[i] = new OrdoSimple();
		}
	}

	@Override
	public String toString(){
		StringBuilder chaine = new StringBuilder();
		for (OrdoSimple ordonnanceur : files){
			chaine.append(ordonnanceur);
		}
		return chaine.toString();
	}

	@Override
	public void entrer(Tache tache){
		if (tache.getPriorite() >= files.length)
			files[files.length - 1].entrer(tache);
		else
			files[tache.getPriorite()].entrer(tache);
	}

	@Override
	public Tache sortie(){
		for (OrdoSimple ordonnanceur : files){
			if (!ordonnanceur.estVide())
				return ordonnanceur.sortie();
		}
		return null;
	}

	@Override
	public boolean estVide() {
		for (OrdoSimple ordonnanceur : files){
			if (!ordonnanceur.estVide())
				return false;
		}
		return true;
	}
}

package tp14Ordonnanceur;

public class Systeme {

	public static void main(String[] args) {
		Ordonnanceur ordonnanceur = new OrdoAvecPriorite(4);

		ordonnanceur.entrer(new ProcessusAfficheur("Fox powa !!!"));
		ordonnanceur.entrer(new ProcessusBoucleur("Fox loop !!!", 5));
		ordonnanceur.entrer(new ProcessusLectureEcriture());
		
		while (!ordonnanceur.estVide()) {
			Processus processus = (Processus)ordonnanceur.sortie();
			processus.execute();
			if (!processus.estFini())
				ordonnanceur.entrer((Tache)processus);
		}
		System.out.println("Exit 0");
	}
}

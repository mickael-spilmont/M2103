package tests;

import tp14Ordonnanceur.*;

public class TestOrdonnanceur {
	public static void main(String[] args){
	    Ordonnanceur ordonnanceur = new OrdoAvecPriorite(4);

	    ordonnanceur.entrer(new TacheSimple("Trouver le donjon", 0));
	    ordonnanceur.entrer(new TacheSimple("Entrer dans le donjon", 2));
	    ordonnanceur.entrer(new TacheSimple("Tuer les gobelins", 3));

		System.out.println(ordonnanceur);

		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");

		ordonnanceur.entrer(new TacheMoinsSimple("Décimer les orcs", 0, "You kill orcs", 3));
		ordonnanceur.entrer(new TacheMoinsSimple("Estourbir la liche", 4, "You kill the Lich", 1));
		ordonnanceur.entrer(new TacheMoinsSimple("Trouver le trésor", 5, "Yhea, I'm RICH !!!", 100000));

		System.out.println(ordonnanceur);

		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
	}
}

package tests;

import tp14Ordonnanceur.*;

public class TestOrdonnanceur {
	public static void main(String[] args){
		Tache tache01 = new TacheSimple("sortir le chien", 3);
		Tache tache02 = new TacheSimple("vider les poubelles", 0);
		Tache tache03 = new TacheSimple("préparer le repas", 2);
		Tache tache04 = new TacheSimple("devenir riche", 3);
		
		Ordonnanceur ordonnanceur = new OrdoAvecPriorite(4);
		
		ordonnanceur.entrer(tache01);
		ordonnanceur.entrer(tache02);
		ordonnanceur.entrer(tache03);
		ordonnanceur.entrer(tache04);

		System.out.println(ordonnanceur);

		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");

		ordonnanceur.entrer(new TacheSimple("Finir la POO", 0));
		ordonnanceur.entrer(new TacheSimple("Devoir de math", 1));
		ordonnanceur.entrer(new TacheSimple("Manger", 2));

		
		System.out.println(ordonnanceur);

		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
		System.out.println(ordonnanceur.sortie() + "\n");
	}
}

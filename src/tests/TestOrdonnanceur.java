package tests;

import tp14Ordonnanceur.OrdoSimple;
import tp14Ordonnanceur.Ordonnanceur;
import tp14Ordonnanceur.Tache;
import tp14Ordonnanceur.TacheSimple;

public class TestOrdonnanceur {
	public static void main(String[] args){
		Tache tache01 = new TacheSimple("sortir le chien", 0);
		Tache tache02 = new TacheSimple("vider les poubelles", 0);
		Tache tache03 = new TacheSimple("préparer le repas", 0);
		Tache tache04 = new TacheSimple("devenir riche", 0);
		
		Ordonnanceur ordonnanceur = new OrdoSimple();
		
		ordonnanceur.entrer(tache01);
		ordonnanceur.entrer(tache02);
		ordonnanceur.entrer(tache03);
		ordonnanceur.entrer(tache04);
		
		System.out.println(ordonnanceur);
	}	
}

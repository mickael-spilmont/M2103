package tests;

import tp13Map.Dictionnaire;

public class TestMap {

	public static void main(String[] args) {
		String francais[] = {"chat", "chien", "renard", "furet", "grenouille"};
		String anglais[] = {"cat", "dog", "fox", "ferret", "frog"};
		
		Dictionnaire dictionnaire = new Dictionnaire(francais, anglais);
		
		dictionnaire.ajouter("lapin", "rabbit");
		dictionnaire.supprimer("grenouille");
		dictionnaire.traduction("furet");
		
		System.out.println(dictionnaire);
		System.out.println(dictionnaire.toStringV2());
	}
}

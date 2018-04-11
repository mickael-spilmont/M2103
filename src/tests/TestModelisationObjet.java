package tests;

import tpModelisationObjet.Element;
import tpModelisationObjet.Piece;

public class TestModelisationObjet {
	
	public static void main(String[] args) {
		Piece piece01 = new Piece("Nvidia GTX 1080", 1536);
		Piece piece02 = new Piece("8 GB GDDR5", 1552);
		
		Element element01 = new Element("Carte graphique");
		element01.add(piece01);
		element01.add(piece02);
		
		System.out.println(element01);
		
		System.out.println("Exit 0");
	}
}
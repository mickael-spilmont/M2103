package tests;

import tpModelisationObjet.Element;
import tpModelisationObjet.Piece;
import tpModelisationObjet.PosteTravail;

public class TestModelisationObjet {
	
	public static void main(String[] args) {
		PosteTravail poste01 = new PosteTravail("Corsair Linux", "Mickael");

		poste01.add(new Piece("Corsair Obsidian 350", 1486));
		poste01.add(new Piece("Asus H97M", 4853));
		poste01.add(new Piece("Intel Core I5-4690 3.9GHz", 2687));

		Element carteGraphique = new Element("MSI");
		carteGraphique.add(new Piece("NVidia GTX 770", 4156));
		carteGraphique.add(new Piece("3 Go GDDR 5", 2365));
		poste01.add(carteGraphique);

		poste01.add(new Piece("Samsung Evo Pro 500Go", 9623));
		poste01.add(new Piece("Corsair CS750M 750W", 4596));
		poste01.add(new Piece("WaterCooling Corsair", 8532));

		poste01.remove(carteGraphique);

		Element nouvelleCarteGraphique = new Element("Asus");
		nouvelleCarteGraphique.add(new Piece("NVidia GTX 1080", 6569));
		nouvelleCarteGraphique.add(new Piece("8 Go GDDR5", 5789));
		poste01.add(nouvelleCarteGraphique);

		System.out.println(poste01);

		System.out.println("Exit 0");
	}
}
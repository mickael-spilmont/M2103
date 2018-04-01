package tests;

import java.time.LocalDate;

import tp10Heritage.DVD;
import tp10Heritage.Document;
import tp10Heritage.Livre;
import tp10Heritage.Mediatheque;

public class testMediatheque {

	public static void main(String[] args) {
		Mediatheque mediatheque = new Mediatheque();
		Livre livre1 = new Livre("gjh42543gs", "Don Quichotte", "Cervantes", "Livre de poche", 2012);
		DVD dvd1 = new DVD("hjogs1324", "Matrix", "Chlebowski", 170);
		Document archive = new Document("fhd576fd");
		
		System.out.println(mediatheque.ajouterDocument(livre1));
		System.out.println(mediatheque.ajouterDocument(dvd1));
		System.out.println(mediatheque.obtenir("hjogs1324"));
		
		System.out.println(mediatheque.emprunter("gjh42543gs", 123513));
		System.out.println(mediatheque.emprunter("gjh42543gs", 123513, LocalDate.now()));
		
		System.out.println(mediatheque.restitutuer("gjh42543gs"));
		System.out.println(mediatheque.restitutuer("gjh42543gs"));
	}

}

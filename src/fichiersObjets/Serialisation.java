package fichiersObjets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import tp10Heritage.DVD;
import tp10Heritage.Document;
import tp10Heritage.Livre;

public class Serialisation {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		Livre livre1 = new Livre("gjh42543gs", "Don Quichotte", "Cervantes", "Livre de poche", 2012);
		DVD dvd1 = new DVD("hjogs1324", "Matrix", "Chlebowski", 170);
		Document archive = new Document("fhd576fd");
		
		try {
			fos = new FileOutputStream("../documents");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(livre1);
			oos.writeObject(dvd1);
			oos.writeObject(archive);
			
			oos.close();
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
	}

}

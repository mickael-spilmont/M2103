package fichiersObjets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import tp10Heritage.DVD;
import tp10Heritage.Document;
import tp10Heritage.Livre;

public class DeSerialisation {
	
	public static void main(String[] args) {
		FileInputStream fis;
		ObjectInputStream ois;
		Object objet;
		
		DVD dvd = null;
		Livre livre = null ;
		Document archive = null;
		
		try {
			fis = new FileInputStream("../documents");
			ois = new ObjectInputStream(fis);
			
			while (fis.available() > 0) {
				objet = ois.readObject();
				
				if (objet instanceof DVD) {
					dvd = (DVD)objet;
				}
				else if (objet instanceof Livre) {
					livre = (Livre)objet;
				}
				else {
					archive = (Document)objet;
				}
			}
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		catch (ClassNotFoundException cnfe) {
			System.err.println(cnfe);
		}
		
		System.out.println(dvd + "\n" + livre + "\n" + archive);
	}
}

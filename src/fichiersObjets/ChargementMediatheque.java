package fichiersObjets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import tp10Heritage.Mediatheque;

public class ChargementMediatheque {

	public static void main(String[] args) {
		Mediatheque mediatheque = null;
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("../mediatheque"));
			mediatheque = (Mediatheque)ois.readObject();
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		catch (ClassNotFoundException cnfe) {
			System.err.println(cnfe);
		}
		
		System.out.println(mediatheque);
	}
}

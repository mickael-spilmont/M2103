package tpFluxTexte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MotsReservesJava {

	public static void main(String[] args) {
		BufferedReader in;
		PrintWriter outTrie, outCVS;
		String ligne;
		ArrayList<String> tableauMots = new ArrayList<>();
		
		try {
			in = new BufferedReader(new FileReader("../MotsReservesJava"));
			outTrie = new PrintWriter("../MotsReservesJavaTraite");
			outCVS = new PrintWriter("../MotsReservesJava.cvs");
			
			ligne = in.readLine();
			while(ligne != null) {
				outCVS.println(ligne.replace("\t", ","));
				tableauMots.add(ligne.split("\t")[0]);
				ligne = in.readLine();
			}
			
			Collections.sort(tableauMots);
			
			for (String mot : tableauMots) {
				outTrie.println(mot);
			}
			
			in.close();
			outCVS.close();
			outTrie.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println(fnfe);
		}
		catch(IOException ioe) {
			System.err.println(ioe);
		}
		System.out.println("Exit 0");
	}

}

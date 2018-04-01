package tp12Interfaces;

import java.util.Comparator;

public class MillitaryComparator implements Comparator<String>{
	public int compare(String chaine1, String chaine2) {
		if ((chaine1.length() - chaine2.length()) != 0) {
			return chaine1.length() - chaine2.length();
		}
		else {
			return chaine1.compareTo(chaine2);
		}
	}
}

package tp14Ordonnanceur;

public class OrdoAvecPriorite implements Ordonnanceur {
	private OrdoSimple[] files;
	
	public OrdoAvecPriorite(int nbPriorites) {
		files = new OrdoSimple[nbPriorites];
	}
}

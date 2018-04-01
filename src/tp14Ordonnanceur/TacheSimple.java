package tp14Ordonnanceur;

public class TacheSimple implements Tache {
	private String intitule;
	private int priorite;
	
	public TacheSimple(String intitule, int priorite) {
		this.intitule = intitule;
		this.priorite = priorite;
	}
	
	public int getPriorite() {
		return this.priorite;
	}
	
	@ Override
	public String toString() {
		return this.intitule + " : " + this.priorite;
	}
}

package tp14Ordonnanceur;

public class ProcessusAfficheur implements Processus, Tache {
	private static int priorite;
	private int compteurExecution;
	private String message;
	
	public ProcessusAfficheur(String message) {
		priorite = 3;
		this.compteurExecution = 0;
		this.message = message;
	}
	
	@Override
	public int getPriorite() {
		return priorite;
	}

	@Override
	public void execute() {
		System.out.println(message);
		compteurExecution ++;
	}
	
	@Override
	public boolean estFini() {
		return (compteurExecution == 1);
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Processus afficheur\nPriorité : ").append(priorite);
		return chaine.toString();
	}
}	
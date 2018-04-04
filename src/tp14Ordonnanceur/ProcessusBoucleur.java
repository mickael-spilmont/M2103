package tp14Ordonnanceur;

public class ProcessusBoucleur implements Processus, Tache {
	private static int priorite;
	private int compteurExecution;
	private int nbExecution;
	private String message;
	
	public ProcessusBoucleur(String message,int nbExecution) {
		priorite = 2;
		this.compteurExecution = 0;
		this.message = message;
		this.nbExecution = nbExecution;
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
		return (compteurExecution == nbExecution);
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Processus boucleur\nPriorité : ").append(priorite).append("\nNombre d'execution : ").append(compteurExecution).append("\n");
		return chaine.toString();
	}
}
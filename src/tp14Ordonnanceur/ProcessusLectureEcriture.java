package tp14Ordonnanceur;

import java.util.Scanner;

public class ProcessusLectureEcriture implements Processus, Tache {
	private static int priorite;
	private int compteurExecution;
	private String message;
	
	public ProcessusLectureEcriture() {
		priorite = 1;
		this.compteurExecution = 0;
	}
	
	@Override
	public int getPriorite() {
		return priorite;
	}
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		if (compteurExecution == 0) {
			this.message = scan.nextLine();
			scan.close();
		}
		else
			System.out.println(message);
	}
	
	@Override
	public boolean estFini() {
		return (compteurExecution == 2);
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Processus afficheur\nPriorité : ").append(priorite).append("\nNombre d'execution : ").append(compteurExecution);
		return chaine.toString();
	}
}
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
		if (compteurExecution == 0) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Entrez votre message : ");
			this.message = scan.nextLine();
			scan.close();
		}
		else
			System.out.println(message);
		
		this.compteurExecution ++;
	}
	
	@Override
	public boolean estFini() {
		return (compteurExecution == 2);
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Processus lecture affichage\nPriorité : ").append(priorite).append("\nNombre d'execution : ").append(compteurExecution).append("\n");
		return chaine.toString();
	}
}
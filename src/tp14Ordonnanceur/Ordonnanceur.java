package tp14Ordonnanceur;

public interface Ordonnanceur {
	/**
	 * ajoute une tache à l'ordonnanceur
	 */
	public void entrer(Tache tache);
	
	/**
	 * extrait (supprime) la tache qui doit sortir le plus tot de l'ordonanceur et la retourne
	 */
	public Tache sortie();
	
	/**
	 * détermine si l'ordonnanceur est vide ou non
	 */
	public boolean estVide();
}

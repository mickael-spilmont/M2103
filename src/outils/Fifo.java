
package outils;

import java.util.ArrayList;

/**
 *
 * @author Erick Timmerman (Erick.Timmerman@univ-lille1.fr)
 * @param <E> type des éléments de la file d'attente
 */
public class Fifo<E>
{
    private final ArrayList<E> enAttente;

    public Fifo()
    {
        this.enAttente = new ArrayList<>();
    }
    
    @Override
    public String toString()
    {
    	StringBuilder chaine = new StringBuilder();
    	for (E element : enAttente) {
    		chaine.append(element).append("\n");
    	}
    	return chaine.toString();
    }
    
    public boolean estVide()
    {
        return enAttente.isEmpty();
    }
    
    public int nbElements()
    {
        return enAttente.size();
    }
    
    public void ajouter(E element)
    {
        enAttente.add(element);
    }
    
    public E suppression()
    {
        // aucun contrôle, si la file d'attente est vide ==> Exception java!
        return enAttente.remove(0);
    }
}

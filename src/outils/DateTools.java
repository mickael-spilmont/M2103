
package outils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

import tpException.FormatDateException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Erick Timmerman (Erick.Timmerman@univ-lille1.fr)
 */
public class DateTools 
{
 // utilitaire pour définir le format littéral d'une date: jj/mm/aaaa
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    
    /**
     * Méthode fournissant une chaîne de caractères représentant la date fournie au format "jj/mm/aaaa"
     * 
     * @param date, la date à formatée
     * @return a String représentation of the given LocalDate 
     */
    public static String dateFormatee(LocalDate date)
    {
        return date.format(FORMATTER);
    }
    
    /*  Création d'un analyseur de chaîne de caractères pour le modèle (pattern): "xx/xx/xxxx"   
        où 'x' représente n'importe quel digit (chiffre décimal).
    */
    private static final Pattern PATTERN = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");

    /**
     * <pre>Méthode de conversion d'une date fournie sous forme de chaîne de caractères en LocalDate.
     * <b>Aucun contrôle de validité (format de la chaîne fournie, validité de la date) pour l'instant!!!</b>
     * </pre>
     * @param date chaîne de caractères supposée représenter une datevalide au formar "jj/mm/aaaa"
     * @return une instance de LocalDate correspondant à la date fournie sous forme littérale
     * @throws FormatDateException 
     */
    public static LocalDate localDateFrom(String date) throws java.time.DateTimeException, FormatDateException
    {
        Matcher m = PATTERN.matcher(date);
        if (m.matches()) // ie: "si la date est bien au format correspondant au modèle voulu"
        {
            String[] elts = date.split("/");  // "découpage" de la châine 

            int jour = Integer.parseInt(elts[0]);
            int mois = Integer.parseInt(elts[1]);
            int annee = Integer.parseInt(elts[2]);

            return LocalDate.of(annee, mois, jour); // une DateTimeException peut être déclenchée!
        }
        throw new FormatDateException("Erreur de format " + date);
        
        // sera à modifier par la suite pour prendre en compte les exceptions possibles!
    }
    
    /**
     * <pre>Méthode permettant la saisie au clavier d'une chaîne de caractères représentant une date
     * (format imposé: "jj/mm/aaaa") et sa conversion en LocalDate.
     * <b>Aucun contrôle effectué pour l'instant, exceptions possibles non gérées!!!</b>
     * </pre>
     * @param message invitation pour la saisie de l'information voulue
     * @return la LocalDate correspondant à la chaîne de caractère lue au clavier
     * @throws FormatDateException 
     * @throws DateTimeException 
     */
    public static LocalDate lireDate(String message) throws DateTimeException, FormatDateException
    {
        String chaine = JOptionPane.showInputDialog(message);
        return DateTools.localDateFrom(chaine);
        
        // sera à modifier par la suite pour prendre en compte les exceptions possibles!
    }    
}

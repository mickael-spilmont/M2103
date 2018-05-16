

package tpException;

import java.time.LocalDate;
import outils.DateTools;

/**
 *
 * @author Erick Timmerman (Erick.Timmerman@univ-lille1.fr)
 */
public class Manifestation 
{
    
    private final String nom;
    private final LocalDate dateDebut, dateFin;
    
  /*
    public Manifestation(String nom, LocalDate dateDebut, LocalDate dateFin) 
    {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
   */  
    
    public Manifestation(String nom, String debut, String fin)
    {
     //   this(nom, DateTools.localDateFrom(debut), DateTools.localDateFrom(fin)); 
        
        this.nom = nom;
        this.dateDebut = DateTools.localDateFrom(debut);
        this.dateFin = DateTools.localDateFrom(fin);
      
    }

    public String getNom()
    {
        return nom;
    }

    public LocalDate getDateDebut()
    {
        return dateDebut;
    }

    public LocalDate getDateFin()
    {
        return dateFin;
    }

    @Override
    public String toString()
    {
        if (dateDebut.equals(dateFin))
        {
            return "  " + nom + " (le " + DateTools.dateFormatee(dateDebut) + ")\n";
        }
        
        return "  " + nom + " (du " + DateTools.dateFormatee(dateDebut) + " au " 
                                    + DateTools.dateFormatee(dateFin) + ")\n";
    }

    public boolean chevauche(Manifestation autre)
    {  
        return !(   this.dateFin.isBefore(autre.dateDebut) 
                 || autre.dateFin.isBefore(this.dateDebut));
    }
    
}

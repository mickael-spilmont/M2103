package tp12Interfaces;

/**
 *
 * @author Erick Timmerman <Erick.Timmerman@univ-lille1.fr>
 */
public class Fraction implements Comparable<Fraction>
{
    private int numerateur;
    private int denominateur;
    
    public Fraction(int numerateur, int denominateur)
    {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        if (denominateur == 0)
        {
            this.numerateur = Integer.MAX_VALUE;    // par exemple!
            this.denominateur = 1;
        }
    }

    public Fraction(int numerateur)
    {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }
    
    
    public int getNumerateur()
    {
        return this.numerateur;
    }

    public int getDenominateur()
    {
        return this.denominateur;
    }
    
    @Override
    public String toString()
    {
        return this.numerateur + "/" + this.denominateur;
    }
    
    public void additionner(Fraction autre)
    {
        int num, den;
        den = this.denominateur * autre.denominateur;
        num = this.numerateur*autre.denominateur + autre.numerateur*this.denominateur; 
        this.numerateur = num;
        this.denominateur = den;
    }
    
    public Fraction somme(Fraction autre)
    {
        int num, den;
        den = this.denominateur * autre.denominateur;
        num = this.numerateur*autre.denominateur + autre.numerateur*this.denominateur; 
        return new Fraction(num, den);
    }
    
    public void multiplier(Fraction autre)
    {
        this.numerateur *= autre.numerateur;
        this.denominateur *= autre.denominateur;
    }
    
    public void multiplier(int facteur)
    {
        this.numerateur *= facteur;
    }
    
    public Fraction produit(Fraction autre)
    {
        return new Fraction(this.numerateur*autre.numerateur,
                            this.denominateur*autre.denominateur);
    }
    
    public double valeurDecimale()
    {
        return (double)this.numerateur / this.denominateur;
    }

    @Override
    public int compareTo(Fraction autre)
    {
        int signe = 1;
        int denoCommun = this.denominateur*autre.denominateur;
        if (denoCommun < 0)
            signe = -1;
        return (this.numerateur*autre.denominateur - autre.numerateur*this.denominateur)
                * signe;
    }
    
    public boolean estEntiere()
    {
        return this.numerateur % this.denominateur == 0;
    }
}

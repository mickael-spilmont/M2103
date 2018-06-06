package jeuDeRole;

public abstract class Personnage {

    private final String NOM;
    private int xp;
    private int pv;
    private boolean vivant;

    public Personnage(String nom){
        this.NOM = nom;
        xp = 10;
        pv = 100;
    }

    abstract public int attaquer();

    abstract public void subirAttaque();
}

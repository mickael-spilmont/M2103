package jeuDeRole;

import java.util.Random;

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

    public String getNOM() {
        return NOM;
    }

    public int getXp() {
        return xp;
    }

    public int getPv() {
        return pv;
    }

    public boolean isVivant() {
        return vivant;
    }

    public void gagnerXp(){
        xp ++;
    }

    protected int tirage(){
        Random dice = new Random();
        return dice.nextInt(xp + 1);
    }

    abstract public int attaquer(Personnage personnage);

    public void subirAttaque(int force){
        pv -= force;

        if (pv <= 0){
            vivant = false;
        }
    }
}

package jeuDeRole;

public class Guerrier extends Personnage implements Combattants{

    private Armes arme;

    public Guerrier(String nom, Armes arme){
        super(nom);
        this.arme = arme;
    }

    @Override
    public Armes getArme() {
        return arme;
    }

    @Override
    public int attaquer(Personnage personnage) {
        int degats;

        if (personnage instanceof Guerrier){
            degats = attaquerGuerrier();
        }
        else{
            degats = attaquerAutre();
        }
        gagnerXp();
        return degats;
    }

    private int attaquerGuerrier(){
        return tirage();
    }

    private int attaquerAutre(){
        return tirage() * arme.getForce();
    }
}

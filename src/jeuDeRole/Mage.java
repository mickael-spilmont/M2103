package jeuDeRole;

public class Mage extends Personnage implements JeteursDeSort{

    private Elements element;

    public Mage(String nom, Elements element){
        super(nom);
        this.element = element;
    }

    @Override
    public Elements getElement() {
        return element;
    }

    @Override
    public int attaquer(Personnage personnage) {
        int degats;

        if(personnage instanceof Mage){
            degats = attaquerMage();
        }
        if(personnage instanceof )
    }

    private int attaquerMage(){
        return tirage() * 2;
    }
}

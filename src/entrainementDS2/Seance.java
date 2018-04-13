package entrainementDS2;

public class Seance implements Planifiable{

    private final String nom;
    private final String nature;
    private final int duree;
    private final int effectif;
    private boolean estPlanifiee = false;

    public Seance(String nom, String nature, int duree, int effectif){
        this.nom = nom;
        this.nature = nature;
        this.duree = duree;
        this.effectif = effectif;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getNature() {
        return nature;
    }

    @Override
    public int getDuree() {
        return duree;
    }

    @Override
    public int getEffectif() {
        return effectif;
    }

    @Override
    public boolean estCompatibleAvec(Salle salle) {
        return (this.nature.equals(salle.getNature()) && this.effectif <= salle.getCapacite());
    }

    @Override
    public boolean estPlanifiee() {
        return estPlanifiee;
    }

    protected void setPlanifiee(boolean bool){
        this.estPlanifiee = bool;
    }
}

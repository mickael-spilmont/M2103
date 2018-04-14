package entrainementDS2;

public class SeancePlanifiee extends Seance implements Affichable{
    private int horaireDebut;
    private Salle salle;

    public SeancePlanifiee(Seance seance, Salle salle, int horaireDebut){
        super(seance.getNom(), seance.getNature(), seance.getDuree(), seance.getEffectif());
        this.salle = salle;
        this.horaireDebut = horaireDebut;
    }

    @Override
    public boolean estPlanifiee() {
        return super.estPlanifiee();
    }

    @Override
    public int getHoraireDebut() {
        return horaireDebut;
    }

    @Override
    public int getHoraireFin(){
        return horaireDebut + getDuree();
    }

    public String identifiantSalle(){
        return this.salle.getIdentifiant();
    }

    Salle getSalle() {
        return salle;
    }
}

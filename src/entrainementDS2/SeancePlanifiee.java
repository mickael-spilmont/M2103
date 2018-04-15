package entrainementDS2;

public class SeancePlanifiee extends Seance implements Affichable{
    private int horaireDebut;
    private Salle salle;

    public SeancePlanifiee(Seance seance, Salle salle, int horaireDebut){
        super(seance.getNom(), seance.getNature(), seance.getDuree(), seance.getEffectif());
        this.salle = salle;
        this.horaireDebut = horaireDebut;
        this.setPlanifiee(true);
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

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Cour de ")
                .append(this.getNom())
                .append(" ; Séance de ")
                .append(this.getNature())
                .append(" ; Dure ")
                .append(this.getDuree())
                .append("h ; Debut ")
                .append(horaireDebut)
                .append(" ; Fin ")
                .append(getHoraireFin())
                .append(" ; Effectif de ")
                .append(this.getEffectif())
                .append(" étudiants ; Salle ")
                .append(this.identifiantSalle())
                .append("\n");

        return stringBuilder.toString();
    }
}

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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Cour de ")
                .append(nom)
                .append(" ; Séance de ")
                .append(nature)
                .append(" ; Dure ")
                .append(duree)
                .append("h ; Effectif de ")
                .append(effectif)
                .append(" étudiants ; Planifiée : ")
                .append(estPlanifiee)
                .append("\n");

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Seance){
            return this.equals((Seance)obj);
        }
        return false;
    }

    public boolean equals(Seance seance) {
        if (this.nom.equals(seance.nom)
                && this.nature.equals(seance.nature)
                && this.duree == seance.duree
                && this.effectif == seance.effectif){
            return true;
        }
        return false;
    }
}

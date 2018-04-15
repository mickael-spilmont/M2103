package entrainementDS2;

import java.util.ArrayList;
import java.util.List;

public class Salles {
    List<Salle> planning;

    public Salles() {
        planning = new ArrayList<>();
    }

    public boolean ajouterSalle(Salle salle) {
        return planning.add(salle);
    }

    public Salle supprimerSalle(Salle salle) {
        if (planning.remove(salle)){
            return salle;
        }
        return null;
    }

    public Salle supprimerSalle(int index){
        if (index >= 0 && index < planning.size()){
            return planning.remove(index);
        }
        return null;
    }

    public SeancePlanifiee accueillir(Seance seance) {
        SeancePlanifiee seancePlanifiee;
        for (Salle salle : planning) {
            seancePlanifiee = salle.accueillir(seance);

            if (seancePlanifiee != null){ return seancePlanifiee; }
        }
        return null;
    }

    public List<SeancePlanifiee> planifier(List<Seance> seances) {
        List<SeancePlanifiee> seancePlanifiees = new ArrayList<>();
        SeancePlanifiee seancePlanifiee;

        for (Seance seance : seances) {
            seancePlanifiee = this.accueillir(seance);

            if (seancePlanifiee != null) { seancePlanifiees.add(seancePlanifiee); }
        }

        return seancePlanifiees;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Salle salle : planning) {
            stringBuilder.append(salle);
        }

        return stringBuilder.toString();
    }
}

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

    public SeancePlanifiee accueillir() {

    }

}

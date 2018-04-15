package entrainementDS2;

import tests.TestDS2;

import java.util.ArrayList;
import java.util.List;

public class Salle {

	private final String identifiant;
	private final String nature;
	private final int capacite;
	protected List<SeancePlanifiee> planning;
	
	public Salle (String identifiant, String nature, int capacite) {
		this.identifiant = identifiant;
		this.nature = nature;
		this.capacite = capacite;
		planning = new ArrayList<>();
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public String getNature() {
		return nature;
	}

	public int getCapacite() {
		return capacite;
	}

	public int horraireAccueilPossible(Seance seance) {
		int finPlannig = 0;
		for (SeancePlanifiee seancePlan : planning){
			finPlannig += seancePlan.getDuree();
		}

		if (finPlannig + seance.getDuree() > TestDS2.HORAIRE_MAX) { return -1; }

		return finPlannig;
	}

	public SeancePlanifiee accueillir(Seance seance) {
		int horaireDebut = horraireAccueilPossible(seance);
		if (horaireDebut < 0 || !(seance.getNature().equals(this.nature)) || seance.getEffectif() > this.capacite){
			return null;
		}

		seance.setPlanifiee(true);
		SeancePlanifiee seancePlanifiee = new SeancePlanifiee(seance, this, horaireDebut);
		planning.add(seancePlanifiee);
		return seancePlanifiee;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("Salle ")
                .append(identifiant)
                .append(" :\n");

		for (SeancePlanifiee seancePlanifiee : planning){
			stringBuilder.append(seancePlanifiee);
		}
		stringBuilder.append("\n");

		return stringBuilder.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Salle){
			return this.equals((Salle)obj);
		}
		return false;
	}

	public boolean equals(Salle salle) {
		if (this.identifiant.equals(salle.identifiant)
				&& this.nature.equals(salle.nature)
				&& this.capacite == salle.capacite){
			return true;
		}
		return false;
	}
}

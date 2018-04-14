package entrainementDS2;

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
}

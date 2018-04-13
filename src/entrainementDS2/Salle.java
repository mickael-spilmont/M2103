package entrainementDS2;

import java.util.ArrayList;

public class Salle {

	private final String IDENTIFIANT;
	private final String NATURE;
	private final int CAPACITE;
	protected List<SeancePlanifiee> planning;
	
	public Salle (String identifiant, String nature, int capacite) {
		this.IDENTIFIANT = identifiant;
		this.NATURE = nature;
		this.CAPACITE = capacite;
		planning = mew ArrayList<>();
	}

	public String getIDENTIFIANT() {
		return IDENTIFIANT;
	}

	public String getNATURE() {
		return NATURE;
	}

	public int getCAPACITE() {
		return CAPACITE;
	}
}

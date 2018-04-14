package entrainementDS2;

public interface Planifiable {
	
	public String getNom();
	public String getNature();
	public int getDuree();
	public int getEffectif();
	public boolean estCompatibleAvec(Salle ressource);
	public boolean estPlanifiee();
}

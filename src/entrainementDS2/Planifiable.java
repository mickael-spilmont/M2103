package entrainementDS2;

public interface Planifiable {
	
	public String getNom();
	public String getNature();
	public String getDuree();
	public String getEffectif();
	public boolean estCompatibleAvec(Salle ressource);
	public boolean estPlanifiee();
}

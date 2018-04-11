package tpModelisationObjet;

public class Piece implements Assemblable {
	private final String LIBELLE;
	private final int NUMERO;
	
	public Piece(String libelle, int numero) {
		this.LIBELLE = libelle;
		this.NUMERO = numero;
	}

	public String getLIBELLE() {
		return LIBELLE;
	}

	public int getNUMERO() {
		return NUMERO;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append(LIBELLE).append(" (n° ").append(NUMERO).append(")\n");
		return chaine.toString();
	}
	
	public boolean equals(Piece autre) {
		return (this.LIBELLE.equals(autre.getLIBELLE()) && this.NUMERO == autre.getNUMERO());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Piece)
			return this.equals((Piece)obj);
		
		return false;
	}
}

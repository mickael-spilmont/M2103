package tp14Ordonnanceur;

public class TacheMoinsSimple implements Tache {
    private String intitule;
    private int priorite;
    private String message;
    private int nombre;

    public TacheMoinsSimple(String intitule, int priorite, String message, int nombre){
        this.intitule = intitule;
        this.priorite = priorite;
        this.message = message;
        this.nombre = nombre;
    }

    @Override
    public int getPriorite() {
        return priorite;
    }

    @Override
    public String toString(){
        StringBuilder chaine = new StringBuilder();
        chaine.append(intitule).append(" : ").append(priorite).append("\n");
        chaine.append("Message : ").append(message).append("\n");
        chaine.append("Nombre : ").append(nombre).append("\n");

        return chaine.toString();
    }
}

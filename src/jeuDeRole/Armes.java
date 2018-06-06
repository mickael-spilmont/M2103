package jeuDeRole;

public enum Armes {

    ARC("arc", 1),
    EPEE("épée", 2),
    HACHE("hache", 3);

    private String type;
    private int force;

    Armes(String type, int force){
        this.type = type;
        this.force = force;
    }

    public String getType() {
        return type;
    }

    public int getForce() {
        return force;
    }
}

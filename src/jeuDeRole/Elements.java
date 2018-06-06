package jeuDeRole;

public enum Elements {

    EAU("eau"),
    FEU("feu"),
    TERRE("terre"),
    GLACE("glace");

    private String type;

    Elements(String type){
        this.type = type;
    }

    public Elements ElementOpose(){
        switch (this){
            case EAU:
                return TERRE;
            case FEU:
                return GLACE;
            case TERRE:
                return EAU;
            default:
                return FEU;
        }
    }

    public String getType() {
        return type;
    }
}

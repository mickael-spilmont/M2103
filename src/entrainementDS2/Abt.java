package entrainementDS2;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Abt implements InterfaceY{
    private LocalDate date;
    private String ref;
    private ArrayList<InterfaceZ> interfaces;
    private Abt abt;

    public Abt(String ref, LocalDate date){
        this.ref = ref;
        this.date = date;
        interfaces = new ArrayList<>();
    }

    public abstract LocalDate ab();

    boolean isAb(){
        return true;
    }

    protected void setAb(Abt abt){
    }

    private void util(){
    }

    public LocalDate methodeX(int n){
        return null;
    }
}

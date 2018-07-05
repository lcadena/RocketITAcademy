package coet;

import java.util.ArrayList;
import java.util.List;

public class Coet {
    public String codiCoet;
    public int numPropulsors;
    public List<Propulsor> propulsors = new ArrayList<>();

    public Coet(String codiCoet, int numPropulsors) throws Exception {
        if(codiCoet==null) throw new Exception();
        if(numPropulsors<0) throw new Exception();
        this.codiCoet = codiCoet;
        this.numPropulsors = numPropulsors;
    }


    public String getCodiCoet() {
        return codiCoet;
    }

    public int getNumPropulsors() {
        return numPropulsors;
    }

    public String getPropulsors() {
        String res = "";
        for (Propulsor p : propulsors) {
            res+=p + ",";
        }
        return res;
    }

    public void addPropulsor(int potencia) throws Exception {
        Propulsor prop = new Propulsor(potencia);
        propulsors.add(prop);
    }


}

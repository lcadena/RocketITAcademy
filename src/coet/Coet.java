package coet;

import java.util.ArrayList;
import java.util.List;

public class Coet {
    public String codiCoet;
    public int velocitatMax;
    public List<Propulsor> propulsors = new ArrayList<>();

    public Coet(String codiCoet) throws Exception {
        if(codiCoet==null) throw new Exception();
        this.codiCoet = codiCoet;
    }

    public void accelerar(int multiple){
        int acceleracio = 10;
        int cn = acceleracio*multiple;
        for (Propulsor p : propulsors) {
            p.canviPotencia(cn);
        }

    }

    public void frenar(int multiple){
        int acceleracio = -10;
        int cn = acceleracio*multiple;
        for (Propulsor p : propulsors) {
            p.canviPotencia(cn);
        }

    }

    public int getVelocitat() {
        int velocitat = 0;
        for (Propulsor p : propulsors) {
            velocitat += p.getPotencia();
        }
        return velocitat;
    }

    public String getCodiCoet() {
        return codiCoet;
    }

    public int getNumPropulsors() {
        return propulsors.size();
    }

    public String getPropulsors() {
        String res = "";
        for (Propulsor p : propulsors) {
            res += p.getPotenciaMax() + " ";
        }
        return res;
    }

    public void addPropulsor(int potencia) throws Exception {
        Propulsor prop = new Propulsor(potencia);
        propulsors.add(prop);
    }


}

package coet;

import java.util.ArrayList;
import java.util.List;

public class Coet {
    public String codiCoet;
    public int numPropulsors;
    public int velocitatmax;
    public List<Propulsor> propulsors = new ArrayList<>();

    public Coet(String codiCoet, int numPropulsors) throws Exception {
        if(codiCoet==null) throw new Exception();
        if(numPropulsors<0) throw new Exception();
        this.codiCoet = codiCoet;
        this.numPropulsors = numPropulsors;
    }

    public int getVelocitatmax() {
        for (Propulsor p : propulsors) {
            velocitatmax+=p.getPotencia();

        }
        return velocitatmax;
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
        return numPropulsors;
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

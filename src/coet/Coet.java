package coet;

public class Coet {
    public String codiCoet;
    public int numPropulsors;

    public Coet (String codiCoet, int numPropulsors) throws Exception {
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

}

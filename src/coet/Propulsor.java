package coet;

public class Propulsor {
    public int potencia;

    public Propulsor (int potencia) throws Exception {
        if(potencia<0) throw new Exception();
        this.potencia = potencia;
    }

    @Override
    public String toString(){
        String result = "" + potencia;
        return result;
    }
}

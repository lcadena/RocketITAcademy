package coet;

public class Propulsor {
    public int potencia;
    public int potenciaMax;

    public Propulsor (int potenciaMax) throws Exception {
        if (potenciaMax <= 0) throw new Exception();
        this.potenciaMax = potenciaMax;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }


    public void canviPotencia(int cn){
        potencia += cn;
        if (potencia > potenciaMax){
            potencia = potenciaMax;
        } else if (potencia < 0 ) {
            potencia = 0;
        }
    }

}

package coet;


import java.util.Iterator;

public class Main {

    public static void main (String[] args) throws Exception {
        Coet c1 = new Coet("32WESSDS", 3);
        c1.addPropulsor(10);
        c1.addPropulsor(30);
        c1.addPropulsor(80);
        Coet c2 = new Coet("32WESSDS", 6);
        c2.addPropulsor(30);
        c2.addPropulsor(40);
        c2.addPropulsor(50);
        c2.addPropulsor(50);
        c2.addPropulsor(30);
        c2.addPropulsor(10);

        System.out.println("-----FASE 1-----");
        System.out.println("El coet amb codi " + c1.getCodiCoet() + " tiene  " + c1.getNumPropulsors() + " propulsors");
        System.out.println("El coet amb codi " + c2.getCodiCoet() + " tiene  " + c2.getNumPropulsors() + " propulsors");

        System.out.println("-----FASE 2-----");
        System.out.println(c1.getCodiCoet() + ": " + c1.getPropulsors());
        System.out.println(c2.getCodiCoet() + ": " + c2.getPropulsors());
    }
}

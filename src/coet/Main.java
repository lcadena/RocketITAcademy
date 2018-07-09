package coet;

public class Main {

    public static void main (String[] args) throws Exception {
        Coet c1 = new Coet("32WESSDS", 3);
        c1.addPropulsor(10);
        c1.addPropulsor(30);
        c1.addPropulsor(80);


        Coet c2 = new Coet("LDSFJA32", 6);
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

        System.out.println("-----FASE 3-----");
        System.out.println("Velocitat actual del coet 1: " + c1.getVelocitatmax());
        System.out.println("Velocitat actual del coet 2: " + c2.getVelocitatmax());


        try {
            System.out.println("Accelerar amb els coets 3 cops");
            c1.accelerar(3);
            c2.accelerar(3);
            printar(c1);
            printar(c2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Frenar cinc cops coet1 y accelerar set amb el coet2");
            c1.frenar(5);
            c2.accelerar(7);
            printar(c1);
            printar(c2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Accelerar amb els coets 5 cops");
            c1.accelerar(15);
            c2.accelerar(15);
            printar(c1);
            printar(c2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void printar(Coet coet){
        System.out.println("Velocitat " + coet.getVelocitat());
    }
}

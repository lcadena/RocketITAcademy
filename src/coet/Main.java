package coet;



public class Main {

    private static CoetController controller = new CoetController();

    public static void main (String[] args) throws Exception {
        Coet c1 = controller.createCoet("32WESSDS", 3);
        Coet c2 = controller.createCoet("LDSFJA32", 6);


        System.out.println("El coet amb codi " + c1.getCodiCoet() + " tiene  " + c1.getNumPropulsors() + " propulsors");
        System.out.println("El coet amb codi " + c2.getCodiCoet() + " tiene  " + c2.getNumPropulsors() + " propulsors");
    }
}

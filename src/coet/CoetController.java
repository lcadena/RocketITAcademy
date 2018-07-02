package coet;

import java.util.ArrayList;
import java.util.List;

public class CoetController {

    public CoetController(){

    }

    public Coet createCoet(String codiCoet, int numPropulsors) throws Exception {
        Coet c1 = new Coet(codiCoet, numPropulsors);
        return c1;
    }

}

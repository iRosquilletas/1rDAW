import java.io.Serializable;

public class SaguaroClass  implements Serializable {

    public String OBJECT;
    public String CON;
    public String RA;
    public String DEC;
    public String MAG;


    public SaguaroClass(String oBJECT, String cON, String rA, String dEC, String mAG) {

        OBJECT = oBJECT;
        CON = cON;
        RA = rA;
        DEC = dEC;
        MAG = mAG;

    }
    
}

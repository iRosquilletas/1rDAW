import java.io.Serializable;

public class galaxias implements Serializable {

    private String obj = "";
    private String Recta = "";
    private String Dec = "";
    private String Mag = "";
    private String Const = "";

    public galaxias(String obj, String Const, String Recta, String Dec, String Mag) {

        this.obj = obj;
        this.Recta = Recta;
        this.Dec = Dec;
        this.Mag = Mag;
        this.Const = Const;

    }

    public String getObj() {
        return obj;
    }

    public String getRecta() {
        return Recta;
    }

    public String getDec() {
        return Dec;
    }

    public String getMag() {
        return Mag;
    }

    @Override
    public String toString() {
        return obj + "  " + Const + "  " + Recta + "  " + Dec + "  " + Mag + "\n";
    }

}

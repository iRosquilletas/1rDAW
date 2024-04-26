public class ejercicio3 {
    private String forma;
    private String color;

    public ejercicio3(String forma, String color) {
        this.forma = forma;
        this.color = color;
    }

    public double area() {
        return 0.0;

    }

    public boolean equals(Object o) {
        // Aquí estaba el error, no lo verificaba
        if (o instanceof ejercicio3) {
            ejercicio3 p = (ejercicio3) o;
            return this.color.equals(p.color) &&
                    this.forma.equals(p.forma) &&
                    this.area() == p.area();

        }
        return false;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        ejercicio3 p1 = new ejercicio3("cuadrado", "rojo");
        ejercicio3 p2 = new ejercicio3("cuadrado", "rojo");
        Double d = new Double(1.0);
        String k = "Hola";
        boolean b1 = p1.equals(p2);
        boolean b2 = d.equals(k);
        boolean b3 = k.equals(p2);
        boolean b4 = p1.equals(d);
        System.out.println("Comparación entre dos objetos Pieza: " + b1);
        System.out.println("Comparación entre un Double y un String: " + b2);
        System.out.println("Comparación entre un String y un objeto Pieza: " + b3);
        System.out.println("Comparación entre un objeto Pieza y un Double: " + b4);
    }
}
package lib;

public class Mesa {

    /*Esto son atributos */
    private String color;
    private int npatas;
    private int ancho;
    private int largo;
    private String material;


    /*Constructor */
    public Mesa() {
        this.color = "Blanco";
        this.npatas = 4;
        this.ancho = 100;
        this.largo = 100;
        this.material = "Madera";




    }

    public Mesa (String a_color, int a_npatas, int a_ancho, int a_largo, String a_material){

        this.color = a_color;
        this.npatas = a_npatas;
        this.ancho = a_ancho;
        this.largo = a_largo;
        this.material = a_material;
    }

    public int area(){
        return this.ancho*this.largo;
    }

    public float area(String unidad){
        float area;
        area = this.ancho*this.largo;
        switch (unidad) {
            case "m";
                area = area / 1000;
            case "in":
            area = area / 2.54 / 2.54;
        }
    }

    public void setColor (String a_color) {
        this.color = a_color;
     
    }

    public int getNpatas() {
        return npatas;
    }

    public void setNpatas(int npatas) {
        this.npatas = npatas;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getColor(){
        return this.color;
    }
    
    public void setMaterial (String a_material) {
        this.material = a_material;
    }

    public String getMaterial(){
        return this.material;
    }
}
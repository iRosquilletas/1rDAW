package lib;

public class Cortesia {

    public static String saludo(String idioma, String nombre) {
        switch (idioma) {
            case "ES": 
            return "Estimado " + nombre;
            case "EN":
            return "Dear " + nombre;
            case "FR":
            return "Cher" + nombre;
            default:
            return "Estimado " + nombre;
        }
}

    public static String despedida(String idioma) {
        switch (idioma) {
            case "ES":
            return "Saludos cordiales";
            case "EN":
            return "Best regards";
            case "FR ":
            return "Bien cordialement";
            default:
            return "Saludos cordiales";
    }
    }
}
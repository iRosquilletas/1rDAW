import java.util.HashMap;

public class Calculos {
    private HashMap<String, Tablon> inventario = Inventario.listado();

    public Resultado realizarCalculos(String referencia, double volumen) throws Exception {
        if (!inventario.containsKey(referencia)) {
            throw new Exception("No existe");

        }

        Tablon tablon = inventario.get(referencia);

        double volumenTablon = tablon.largo * tablon.ancho * tablon.alto / 1000000000.0;
        int unidadesNecesarias = (int) Math.ceil(volumen / volumenTablon);
        double precioTotal = unidadesNecesarias * tablon.precio;

        double precioPorM3 = precioTotal / volumen;

        return new Resultado(precioTotal, unidadesNecesarias, precioPorM3);
    }
}
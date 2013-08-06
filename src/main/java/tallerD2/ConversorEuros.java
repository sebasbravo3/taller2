package tallerD2;

/**
 * Created with IntelliJ IDEA.
 * User: Usuario
 * Date: 3/08/13
 * Time: 03:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConversorEuros {
    private double cambio;
    public ConversorEuros ( double valorCambio ) {
// valor en la moneda de 1 euro
        cambio = valorCambio;
    }
    public double eurosAmoneda (double cantidad) {
        return cantidad * cambio;
    }
    public double monedaAeuros (double cantidad) {
        return cantidad / cambio;
    }
}

package tallerD2;

/**
 * Created with IntelliJ IDEA.
 * User: Usuario
 * Date: 3/08/13
 * Time: 03:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConversorEurosPesetas extends ConversorEuros {
    // Adaptador de clase
    public ConversorEurosPesetas () {
        super(166.386D);
    }
    public double eurosApesetas(double cantidad) {
        return eurosAmoneda(cantidad);
    }
    public double pesetasAeuros(double cantidad) {
        return monedaAeuros(cantidad);
    }

}

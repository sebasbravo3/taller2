package tallerD2;

/**
 * Created with IntelliJ IDEA.
 * User: Usuario
 * Date: 3/08/13
 * Time: 05:52 PM
 * To change this template use File | Settings | File Templates.
 */
public interface InterfazVista {
    void setControlador(ControlConversor c);
    void arranca(); // comienza la visualización
    double getCantidad(); // cantidad a convertir
    void escribeCambio(String s); //texto con la conversión
    // Constantes que definen las posibles operaciones:
    static final String AEUROS="Pesetas a Euros";
    static final String APESETAS="Euros a Pesetas";
}

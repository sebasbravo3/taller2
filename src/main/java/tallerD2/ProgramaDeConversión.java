package tallerD2;

/**
 * Created with IntelliJ IDEA.
 * User: Usuario
 * Date: 3/08/13
 * Time: 05:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProgramaDeConversión {
    public static void main(String[] args) {
// el modelo:
        ConversorEurosPesetas modelo = new ConversorEurosPesetas();
// la vista:
        InterfazVista vista = new VentanaConversor();
// y el control:
        ControlConversor control = new ControlConversor (vista,
                modelo);
// configura la vista
        vista.setControlador(control);
// y arranca la interfaz (vista):
        vista.arranca();
    }

}

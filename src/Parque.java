import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Parque {
    private String nombre;
    private List<Atraccion> listaAtracciones = new ArrayList<>();
    private List<Operador> listaOperadores = new ArrayList<>();
    private List<Visitante> listaVisitantes = new ArrayList<>();

    public Parque(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAtraccion(Atraccion atraccion) {
        listaAtracciones.add(atraccion);
    }

    public void agregarOperador(Operador operador) {
        listaOperadores.add(operador);
    }

    public void agregarVisitante() {
        String nombre = MisFunciones.pedirStrNoVacio("nombre?");
        if (nombre==null) return;
        int altura = MisFunciones.pedirNumeroMasCero("altura?");
        if (altura==-1) return;
        int edad = MisFunciones.pedirNumeroMasCero("edad?");
        if (edad==-1) return;
        int peso = MisFunciones.pedirNumeroMasCero("peso?");
        if (peso==-1) return;
        Visitante visitante = new Visitante(nombre, altura, edad, peso);
        listaVisitantes.add(visitante);
    }

    public void asignarOperador(Operador operador, Atraccion atraccion) {
        operador.asignarAtraccion(atraccion);
        atraccion.asignarOperador(operador);
    }

    public String recibirVisitante(Atraccion atraccion) {

        if (listaVisitantes.isEmpty()) {
            JOptionPane.showMessageDialog(null,"No hay visitantes");
            return "No hay visitantes en parque";
        }
        Visitante visitante = (Visitante) MisFunciones.eligirObjDeLista(listaVisitantes);
        if (atraccion.verificarAcceso(visitante)) {
            JOptionPane.showMessageDialog(null,"Acceso permitido a "
                    + visitante.getNombre()
                    + " en la atraccion "
                    + atraccion.getNombre());
            return "Acceso permitido a " + visitante.getNombre() + " en la atraccion " + atraccion.getNombre();
        } else {
            JOptionPane.showMessageDialog(null,"Acceso denegado a "
                    + visitante.getNombre()
                    + " en la atraccion "
                    + atraccion.getNombre());
            return "Acceso denegado a " + visitante.getNombre() + " en la atraccion " + atraccion.getNombre();
        }
    }

    @Override
    public String toString() {
        return  "Parque: " + nombre + "\n" +
                "Atracciones" + "\n" + listaAtracciones + "\n" +
                "Operadores" + "\n" + listaOperadores + "\n" +
                "Visitantes" + "\n" + listaVisitantes + "\n";
    }
}

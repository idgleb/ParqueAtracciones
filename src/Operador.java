public class Operador {
    private String nombre;
    private Atraccion atraccionAsignada;

    public Operador(String nombre) {
        this.nombre = nombre;
    }

    public void asignarAtraccion(Atraccion atraccion) {
        this.atraccionAsignada = atraccion;
    }

    public boolean verificarAcceso(Visitante visitante) {
        if (atraccionAsignada != null) {
            return atraccionAsignada.verificarAcceso(visitante);
        }
        return false;
    }

    @Override
    public String toString() {
        return "operador=" + nombre + ", atraccionAsignada=" + atraccionAsignada;
    }
}

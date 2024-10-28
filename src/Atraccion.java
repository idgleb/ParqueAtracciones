public abstract class Atraccion {
    protected String nombre;
    protected Requisito requisitos;
    protected Operador operador;

    public Atraccion(String nombre, Requisito requisitos) {
        this.nombre = nombre;
        this.requisitos = requisitos;
    }

    public void asignarOperador(Operador operador) {
        this.operador = operador;
    }

    public boolean verificarAcceso(Visitante visitante) {
        return requisitos.cumpleRequisitos(visitante);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + ". Requisitos: " + requisitos + "\n";
    }
}

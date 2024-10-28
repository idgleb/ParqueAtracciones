public class Requisito {
    private Integer alturaMinima;
    private Integer edadMinima;
    private Integer pesoMaximo;

    public Requisito(Integer alturaMinima, Integer edadMinima, Integer pesoMaximo) {
        this.alturaMinima = alturaMinima;
        this.edadMinima = edadMinima;
        this.pesoMaximo = pesoMaximo;
    }

    public boolean cumpleRequisitos(Visitante visitante) {
        if (alturaMinima != null && visitante.getAltura() < alturaMinima) {
            return false;
        }
        if (edadMinima != null && visitante.getEdad() < edadMinima) {
            return false;
        }
        if (pesoMaximo != null && visitante.getPeso() > pesoMaximo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alturaMinima=" + alturaMinima +
                ", edadMinima=" + edadMinima +
                ", pesoMaximo=" + pesoMaximo;
    }
}

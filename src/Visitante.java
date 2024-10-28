public class Visitante {
    private String nombre;
    private int altura;
    private int edad;
    private int peso;

    public Visitante(String nombre, int altura, int edad, int peso) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  "visitante=" + nombre  +
                ", altura=" + altura +
                ", edad=" + edad +
                ", peso=" + peso + "\n";
    }
}

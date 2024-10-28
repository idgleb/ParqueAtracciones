public class Main {
    public static void main(String[] args) {
        // Crear requisitos específicos para la montaña rusa y casa del terror
        Requisito requisitoMontanaRusa = new Requisito(120, 10, 90);
        Requisito requisitoCasaDelTerror = new Requisito(null, 12, null);

        // Crear atracciones
        Atraccion montanaRusa = new MontanaRusa("Montaña Rusa", requisitoMontanaRusa);
        Atraccion casaDelTerror = new CasaDelTerror("Casa del Terror", requisitoCasaDelTerror);

        // Crear parque
        Parque parque = new Parque("Parque de Diversiones");

        // Crear operadores
        Operador operador1 = new Operador("Carlos");
        Operador operador2 = new Operador("Maria");

        // Agregar atracciones y operadores al parque
        parque.agregarAtraccion(montanaRusa);
        parque.agregarAtraccion(casaDelTerror);
        parque.agregarOperador(operador1);
        parque.agregarOperador(operador2);

        // Asignar operadores a las atracciones
        parque.asignarOperador(operador1, montanaRusa);
        parque.asignarOperador(operador2, casaDelTerror);

        String[] opc = {"agregarVisitante", "Montania rusa", "Casa del Terror"};
        Runnable[] ac = new Runnable[]{
                () -> parque.agregarVisitante(),
                () -> parque.recibirVisitante(montanaRusa),
                () -> parque.recibirVisitante(casaDelTerror),
        };

        MisFunciones.interfaz(ac, opc, parque::toString);

    }
}

public class Main {

    public static void main(String[] args) {

        // Prueba 1: los servidores comienzan apagados
        System.out.println("=== Prueba 1: servidores recién creados ===");
        Servidor servidor1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor servidor2 = new Servidor("ServidorBD", "192.168.1.21");
        Servidor servidor3 = new Servidor("ServidorCorreo", "192.168.1.22");

        System.out.println("Total de servidores: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

        // Prueba 2: activar servidores (activar dos veces no cuenta doble)
        System.out.println();
        System.out.println("=== Prueba 2: activar ===");
        servidor1.activar();
        servidor2.activar();
        servidor1.activar();   // ya estaba activo, no debe contarse otra vez

        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

        // Prueba 3: desactivar servidores (desactivar uno apagado no descuenta)
        System.out.println();
        System.out.println("=== Prueba 3: desactivar ===");
        servidor2.desactivar();
        servidor3.desactivar();   // ya estaba apagado, no debe descontar

        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

        // Datos de cada servidor
        System.out.println();
        System.out.println("=== Datos finales ===");
        servidor1.mostrarInformacion();
        System.out.println();
        servidor2.mostrarInformacion();
        System.out.println();
        servidor3.mostrarInformacion();
        System.out.println();
        System.out.println("Total de servidores: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());
    }
}
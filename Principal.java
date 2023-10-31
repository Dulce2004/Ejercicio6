
/**
 * Esta clase es donde se crea la interacción con el usuario
 * 
 * @author: Dulce Ambrosio - 231143 , sección 20
 * @version: 29/10/2023
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Archivo archivo = new Archivo();
        archivo.cargarDatos();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---BIENVENIDO AL SISTEMA---");
            System.out.println("1. Controlar Video ");
            System.out.println("2. Mostrar la información de un dispositivo");
            System.out.println("3. Mostrar el estado actual de un dispositivo");
            System.out.println("4. Mostrar el dispositivo más barato");
            System.out.println("5. Mostrar el dispositivo más caro");
            System.out.println("6. Salir");
            System.out.println("Escoja la opción que desee: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controlarDispositivo(archivo.getElectroTechs());
                    break;
                case 2:
                    mostrarDispositivos(archivo.getElectroTechs());
                    break;
                case 3:
                    mostrarEstadoActual(archivo.getElectroTechs());
                    break;
                case 4:
                    mostrarDispositivoMasBarato(archivo.getElectroTechs());
                    break;
                case 5:
                    mostrarDispositivoMasCaro(archivo.getElectroTechs());
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    /**
     * Método para controlar los dispositivos
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public static void controlarDispositivo(ArrayList<ElectroTech> dispositivos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija el dispositivo que desea controlar (Ingrese el índice): ");
        for (int i = 0; i < dispositivos.size(); i++) {
            System.out.println(i + ". " + dispositivos.get(i).getMarca() + " " + dispositivos.get(i).getModelo());
        }
        int indiceDispositivo = scanner.nextInt();

        if (indiceDispositivo < 0 || indiceDispositivo >= dispositivos.size()) {
            System.out.println("Índice de dispositivo inválido");
            return;
        }

        ElectroTech dispositivo = dispositivos.get(indiceDispositivo);

        System.out.println("El dispositivo seleccionado es: " + dispositivo.getMarca() + " " + dispositivo.getModelo());

        System.out.println("Estado actual del dispositivo: " + dispositivo.getEstadoDispositivo());
        System.out.println("1. Encender/Apagar");
        System.out.println("2. Subir Volumen");
        System.out.println("3. Bajar Volumen");
        System.out.println("4. Aumentar Brillo");
        System.out.println("5. Disminuir Brillo");

        int opcionControl = scanner.nextInt();

        switch (opcionControl) {
            case 1:
                // Encender/Apagar el dispositivo
                if (dispositivo.getEstadoDispositivo().equals("Encendido")) {
                    dispositivo.setEstadoDispositivo("Apagado");
                    System.out.println("El dispositivo ha sido apagado.");
                } else {
                    dispositivo.setEstadoDispositivo("Encendido");
                    System.out.println("El dispositivo ha sido encendido.");
                }
                break;
            case 2:
                dispositivo.subirVolumen();
                System.out.println("Volumen subido.");
                break;
            case 3:
                dispositivo.bajarVolumen();
                System.out.println("Volumen bajado.");
                break;
            case 4:
                dispositivo.aumentarBrillo();
                System.out.println("Brillo aumentado.");
                break;
            case 5:
                dispositivo.disminuirBrillo();
                System.out.println("Brillo disminuido.");
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    /**
     * Método para mostrar los dispositivos
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public static void mostrarDispositivos(ArrayList<ElectroTech> dispositivos) {
        for (ElectroTech dispositivo : dispositivos) {
            dispositivo.mostrarInformacion();
            System.out.println("------------------------------");
        }
    }

    /**
     * Método para mostrar el estado actual del dispositivo
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public static void mostrarEstadoActual(ArrayList<ElectroTech> dispositivos) {
        for (ElectroTech dispositivo : dispositivos) {
            dispositivo.mostrarEstadoactual();
            System.out.println("------------------------------");
        }
    }

    /**
     * Método para mostrar el dispositivo mas barato
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public static void mostrarDispositivoMasBarato(ArrayList<ElectroTech> dispositivos) {
        ElectroTech dispositivoMasBarato = null;
        double precioMasBajo = Double.MAX_VALUE;

        for (ElectroTech dispositivo : dispositivos) {
            if (dispositivo.getPrecio() < precioMasBajo) {
                precioMasBajo = dispositivo.getPrecio();
                dispositivoMasBarato = dispositivo;
            }
        }

        if (dispositivoMasBarato != null) {
            System.out.println("El dispositivo más barato es: ");
            dispositivoMasBarato.mostrarInformacion();
        } else {
            System.out.println("No se encontró ningún dispositivo.");
        }
    }

    /**
     * Método para mostrar el dispositivo mas caro
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public static void mostrarDispositivoMasCaro(ArrayList<ElectroTech> dispositivos) {
        ElectroTech dispositivoMasCaro = null;
        double precioMasAlto = 0;

        for (ElectroTech dispositivo : dispositivos) {
            if (dispositivo.getPrecio() > precioMasAlto) {
                precioMasAlto = dispositivo.getPrecio();
                dispositivoMasCaro = dispositivo;
            }
        }

        if (dispositivoMasCaro != null) {
            System.out.println("El dispositivo más caro es: ");
            dispositivoMasCaro.mostrarInformacion();
        } else {
            System.out.println("No se encontró ningún dispositivo.");
        }
    }

}

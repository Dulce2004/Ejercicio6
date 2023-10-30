import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.CRC32;

public class Archivo {
    private ArrayList<ElectroTech> electroTechs;

    public Archivo() {
        electroTechs = new ArrayList<ElectroTech>();
    }

    public String cargarDatos() {
        String archivo = "Datos.CSV";
        try (Scanner scanner = new Scanner(new File(archivo))) {
            while (scanner.hasNextLine()) {
                String[] categorias = scanner.nextLine().split(",");
                String tipo = categorias[0];
                double precio = Double.parseDouble(categorias[1]);
                int visaCuotas = Integer.parseInt(categorias[2]);
                String marca = categorias[3];
                String modelo = categorias[4];
                int ram = Integer.parseInt(categorias[5]);
                String estadoDispositivo = categorias[6];
                int video = Integer.parseInt(categorias[7]);
                int volumen = Integer.parseInt(categorias[8]);
                int brillo = Integer.parseInt(categorias[9]);
                String videoMostrado = categorias[10];
                String categoria1 = categorias[11];
                String categoria2 = categorias[12];
                String categoria3 = categorias[13];
                String categoria4 = categorias[14];
                String categoria5 = categorias[15];

                if (categoria5.equals("x")) {
                    ElectroTech electroTech = new Computadora(precio, visaCuotas, marca, modelo, estadoDispositivo, ram,
                            videoMostrado, volumen, brillo, videoMostrado, tipo, categoria3, categoria4, categoria5,
                            tipo);
                } else {
                }

            }
        }
    }

}
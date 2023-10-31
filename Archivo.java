
/**
 * Esta clase es donde se cargan los datos del .csv
 * 
 * @author: Dulce Ambrosio - 231143 , sección 20
 * @version: 29/10/2023
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
    private ArrayList<ElectroTech> electroTechs;

    /*
     * Class constructor
     */
    public Archivo() {
        electroTechs = new ArrayList<ElectroTech>();
    }

    /**
     * Método para cargar los datos al .csv
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public void cargarDatos() {
        String archivo = "Datos.csv";
        try (Scanner scanner = new Scanner(new File(archivo))) {
            // Saltar la primera línea (encabezados)
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String[] categorias = scanner.nextLine().split(",");
                if (categorias.length >= 19) { // Asegúrate de que haya suficientes campos
                    try {
                        // Realizar la conversión a números si los valores son numéricos
                        String tipo = categorias[0];
                        double precio = Double.parseDouble(categorias[1]);
                        int visaCuotas = Integer.parseInt(categorias[2]);
                        // Resto de las conversiones a números

                        // Aquí continúa con la lógica para crear los objetos con los valores
                        // convertidos
                        // y añadirlos a la lista de dispositivos
                    } catch (NumberFormatException e) {
                        // Manejo del error en caso de que un valor no se pueda convertir a número
                        System.out.println("Error: No se puede convertir a número");
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Error: La línea no tiene suficientes campos");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /*
     * setters y getters
     */
    public ArrayList<ElectroTech> getElectroTechs() {
        return electroTechs;
    }

    public void setElectroTechs(ArrayList<ElectroTech> electroTechs) {
        this.electroTechs = electroTechs;
    }
}

/**
 * Esta clase es donde se crean los métodos que implementaran ElectroTech
 * 
 * @author: Dulce Ambrosio - 231143 , sección 20
 * @version: 29/10/2023
 */
public interface ProductoInterfaz {
    /**
     * Métodos para subir el volumen
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public void subirVolumen();

    /**
     * Métodos para bajar el volumen
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public void bajarVolumen();

    /**
     * Métodos para subir el brillo
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public void aumentarBrillo();

    /**
     * Métodos para disminuir el brillo
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public void disminuirBrillo();

    /**
     * Métodos para mostrar la informacion
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public void mostrarInformacion();

    /**
     * Métodos para mostrar el estado actual del dispositivo
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public void mostrarEstadoactual();

    /**
     * Métodos para controlar los videos del dispositivo
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    public void controlarVideos();
}
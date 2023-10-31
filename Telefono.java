/**
 * Esta clase es donde se heredan los métodos implementados por ElectroTech
 * 
 * @author: Dulce Ambrosio - 231143 , sección 20
 * @version: 29/10/2023
 */
public class Telefono extends ElectroTech {
    private String procesador;
    private String almacenamiento;
    private String extender;
    private String cargador;
    private String g;

    /*
     * Class constructor
     */
    public Telefono(double precio, int visaCuotas, String marca, String modelo, String estadoDispositivo, int ram,
            int video, int volumen, int brillo, String videoMostrado, String tipo, String procesador,
            String almacenamiento, String extender, String cargador, String g) {
        super(precio, visaCuotas, marca, modelo, estadoDispositivo, ram, video, volumen, brillo, videoMostrado, tipo);
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.extender = extender;
        this.cargador = cargador;
        this.g = g;
    }

    /*
     * setters y getters
     */
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getExtender() {
        return extender;
    }

    public void setExtender(String extender) {
        this.extender = extender;
    }

    public String getCargador() {
        return cargador;
    }

    public void setCargador(String cargador) {
        this.cargador = cargador;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    /**
     * Métodopara aumentar el brillo en un intervalo del 3%
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void aumentarBrillo() {
        brillo += brillo + 3;
        if (brillo < 100) {
            brillo = 100;
        }
        super.aumentarBrillo();

    }

    /**
     * Métodopara bajar el volumen en un intervalo del 2%
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void bajarVolumen() {
        volumen -= volumen - 2;
        if (volumen < 0) {
            volumen = 0;

        }
        super.bajarVolumen();
    }

    /**
     * Métodopara bajar controlas los videos
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void controlarVideos() {
        super.controlarVideos();
    }

    /**
     * Método para disminuir el brillo en intervalos del 3%
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void disminuirBrillo() {
        brillo -= brillo - 3;
        if (brillo < 0) {
            brillo = 0;

        }
        super.disminuirBrillo();
    }

    /**
     * Método para dmostrar el estado actual
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void mostrarEstadoactual() {
        super.mostrarEstadoactual();
    }

    /**
     * Método para mostrar información
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Procesador: " + procesador);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("Se puede extender la memorica (USB): " + extender);
        System.out.println("Trae Cargador: " + cargador);
        System.out.println("Conecta con 5G: " + g);
    }

    /**
     * Método para subir el volumen en intervalos del 2%
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void subirVolumen() {
        volumen += volumen + 2;
        if (volumen < 100) {
            volumen = 100;
        }
        super.subirVolumen();
    }

}
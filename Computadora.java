/**
 * Esta clase es donde se heredan los métodos implementados por ElectroTech
 * 
 * @author: Dulce Ambrosio - 231143 , sección 20
 * @version: 29/10/2023
 */
public class Computadora extends ElectroTech {
    private String velocidadGPU;
    private String velocidadCPU;
    private String tamanoDisco;
    private String tipoDisco;

    /*
     * Class constructor
     */
    public Computadora(double precio, int visaCuotas, String marca, String modelo, String estadoDispositivo, int ram,
            int video, int volumen, int brillo, String vidoMostrado, String tipo, String velocidadGPU,
            String velocidadCPU, String tamanoDisco, String tipoDisco) {
        super(precio, visaCuotas, marca, modelo, estadoDispositivo, ram, video, volumen, brillo, vidoMostrado, tipo);
        this.velocidadGPU = velocidadGPU;
        this.velocidadCPU = velocidadCPU;
        this.tamanoDisco = tamanoDisco;
        this.tipoDisco = tipoDisco;
    }

    /*
     * setters y getters
     */
    public String getVelocidadGPU() {
        return velocidadGPU;
    }

    public void setVelocidadGPU(String velocidadGPU) {
        this.velocidadGPU = velocidadGPU;
    }

    public String getVelocidadCPU() {
        return velocidadCPU;
    }

    public void setVelocidadCPU(String velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
    }

    public String getTamanoDisco() {
        return tamanoDisco;
    }

    public void setTamanoDisco(String tamanoDisco) {
        this.tamanoDisco = tamanoDisco;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    /**
     * Métodopara aumentar el brillo en un intervalo del 5%
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void aumentarBrillo() {
        super.aumentarBrillo();
        brillo += brillo + 5;
        if (brillo < 100) {
            brillo = 100;
        }

    }

    /**
     * Métodopara bajar el volumen en un intervalo del 10%
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void bajarVolumen() {
        super.bajarVolumen();
        volumen -= volumen - 10;
        if (volumen < 0) {
            volumen = 0;

        }

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
     * Método para disminuir el brillo en intervalos del 5%
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void disminuirBrillo() {
        brillo -= brillo - 5;
        if (brillo < 0) {
            brillo = 0;

        }
        super.disminuirBrillo();
    }

    /**
     * Método para mostrar el estado actual
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
        System.out.println("Velocidad del CPU: " + velocidadCPU + " GHZ");
        System.out.println("Velocidad del GPU: " + velocidadGPU + " MHZ");
        System.out.println("Tamaño del Disco: " + tamanoDisco);
        System.out.println("Tipo del Disco: " + tipoDisco);
    }

    /**
     * Método para subir el volumen en intervalos del 10%
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void subirVolumen() {
        volumen -= volumen - 10;
        if (volumen < 0) {
            volumen = 0;

        }
        super.subirVolumen();
    }

}
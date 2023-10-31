
/**
 * Esta clase es donde se crea la implementacion con la interfaz y se vuelve la clase padre
 * 
 * @author: Dulce Ambrosio - 231143 , sección 20
 * @version: 29/10/2023
 */
import java.util.ArrayList;
import java.util.Scanner;

public abstract class ElectroTech implements ProductoInterfaz {
    protected double precio;
    protected int visaCuotas;
    protected String marca;
    protected String modelo;
    protected String estadoDispositivo;
    protected int ram;
    protected int video;
    protected int volumen;
    protected int brillo;
    protected String videoMostrado;
    protected String tipo;

    /*
     * Class constructor
     */
    public ElectroTech(double precio, int visaCuotas, String marca, String modelo, String estadoDispositivo, int ram,
            int video, int volumen, int brillo, String videoMostrado, String tipo) {
        this.precio = precio;
        this.visaCuotas = visaCuotas;
        this.marca = marca;
        this.modelo = modelo;
        this.estadoDispositivo = estadoDispositivo;
        this.ram = ram;
        this.video = video;
        this.volumen = volumen;
        this.brillo = brillo;
        this.videoMostrado = videoMostrado;
        this.tipo = tipo;

    }

    /*
     * setters y getters
     */
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVisaCuotas() {
        return visaCuotas;
    }

    public void setVisaCuotas(int visaCuotas) {
        this.visaCuotas = visaCuotas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstadoDispositivo() {
        return estadoDispositivo;
    }

    public void setEstadoDispositivo(String estadoDispositivo) {
        this.estadoDispositivo = estadoDispositivo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public String getVideoMostrado() {
        return videoMostrado;
    }

    public void setVideoMostrado(String videoMostrado) {
        this.videoMostrado = videoMostrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Métodos implementado de la interfaz para subir el brillo
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void aumentarBrillo() {

    }

    /**
     * Métodos implementado de la interfaz para bajar el brillo
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void bajarVolumen() {

    }

    /**
     * Métodos implementado de la interfaz para controlar los videos
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void controlarVideos() {

    }

    /**
     * Métodos implementado de la interfaz para disminuir el brillo
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void disminuirBrillo() {

    }

    /**
     * Métodos implementado de la interfaz para mostrar el estado actual del
     * dispositivo
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void mostrarEstadoactual() {
        System.out.println("Estado del dispositivo: " + estadoDispositivo);
        System.out.println("Volumen: " + volumen);
        System.out.println("Brillo: " + brillo);
        System.out.println("Num de video mostrado: " + video);
        System.out.println("Estado del video: ");

    }

    /**
     * Métodos implementado de la interfaz para mostrar la información
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void mostrarInformacion() {

        System.out.println("Tipo: " + tipo);
        System.out.println("Precio: " + precio);
        System.out.println("VisaCuotas: " + visaCuotas);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("RAM: " + ram);
        System.out.println("Estado del Dispositivo: " + estadoDispositivo);
        System.out.println("Número de video: " + video);
        System.out.println("Volumen: " + volumen);
        System.out.println("Brillo: " + brillo);
        System.out.println("Estado del Video: " + videoMostrado);

    }

    /**
     * Métodos implementado de la interfaz para subir el volumen
     * 
     * @param param1 los valores son de tipo String
     * @return devuelve un String
     */
    @Override
    public void subirVolumen() {

    }

}
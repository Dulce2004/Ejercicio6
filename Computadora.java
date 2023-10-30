public class Computadora extends ElectroTech {
    private String velocidadGPU;
    private String velocidadCPU;
    private String tamanoDisco;
    private String tipoDisco;

    public Computadora(double precio, int visaCuotas, String marca, String modelo, String estadoDispositivo, int ram,
            String video, int volumen, int brillo, String vidoMostrado, String tipo, String velocidadGPU,
            String velocidadCPU, String tamanoDisco, String tipoDisco) {
        super(precio, visaCuotas, marca, modelo, estadoDispositivo, ram, video, volumen, brillo, vidoMostrado, tipo);
        this.velocidadGPU = velocidadGPU;
        this.velocidadCPU = velocidadCPU;
        this.tamanoDisco = tamanoDisco;
        this.tipoDisco = tipoDisco;
    }
    //realizar comentarios
}
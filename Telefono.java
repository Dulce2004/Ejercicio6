public class Telefono extends ElectroTech {
    private String procesador;
    private String almacenamiento;
    private String extender;
    private String cargador;
    private String g;

    public Telefono(double precio, int visaCuotas, String marca, String modelo, String estadoDispositivo, int ram,
            String video, int volumen, int brillo, String videoMostrado, String tipo, String categoria1,
            String categoria2, String categoria3, String categoria4, String categoria5, String procesador,
            String almacenamiento, String extender, String cargador, String g) {
        super(precio, visaCuotas, marca, modelo, estadoDispositivo, ram, video, volumen, brillo, videoMostrado, tipo,
                categoria1, categoria2, categoria3, categoria4, categoria5);
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.extender = extender;
        this.cargador = cargador;
        this.g = g;
    }

}
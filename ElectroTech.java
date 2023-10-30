public class ElectroTech implements ProductoInterfaz {
    protected double precio;
    protected int visaCuotas;
    protected String marca;
    protected String modelo;
    protected String estadoDispositivo;
    protected int ram;
    protected String video;
    protected int volumen;
    protected int brillo;
    protected String videoMostrado;
    protected String tipo;

    public ElectroTech(double precio, int visaCuotas, String marca, String modelo, String estadoDispositivo, int ram,
            String video, int volumen, int brillo, String videoMostrado, String tipo) {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public void aumentarBrillo() {
        // TODO Auto-generated method stub

    }

    @Override
    public void bajarVolumen() {
        // TODO Auto-generated method stub

    }

    @Override
    public void controlarVideos() {
        // TODO Auto-generated method stub

    }

    @Override
    public void disminuirBrillo() {
        // TODO Auto-generated method stub

    }

    @Override
    public void mostrarEstadoactual() {
        // TODO Auto-generated method stub

    }

    @Override
    public void mostrarInformacion() {
        // TODO Auto-generated method stub

    }

    @Override
    public void subirVolumen() {
        // TODO Auto-generated method stub

    }

}
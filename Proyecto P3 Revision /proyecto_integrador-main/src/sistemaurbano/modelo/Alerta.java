package sistemaurbano.modelo;

public class Alerta {
    private String codigoAlerta;
    private String mensaje;
    private String origen; // punto de inicio
    private String destino; // punto de llegada

    public Alerta(String codigoAlerta, String mensaje, String origen, String destino) {
        this.codigoAlerta = codigoAlerta;
        this.mensaje = mensaje;
        this.origen = origen; // guarda el origen
        this.destino = destino; // guarda el destino
    }

    public void mostrarInfo() {
        // enseña los datos por pantalla
        System.out.println("[" + codigoAlerta + "] Notificación General: " + mensaje);
        System.out.println("Tramo: " + origen + " -> " + destino);
    }

    public String getCodigoAlerta() { return codigoAlerta; }
    public String getMensaje() { return mensaje; }
    public String getOrigen() { return origen; } // da el origen
    public String getDestino() { return destino; } // da el destino
}
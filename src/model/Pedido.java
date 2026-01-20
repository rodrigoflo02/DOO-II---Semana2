package model;

public abstract class Pedido {
    private int idpedido;
    private String direccionEntrega;
    private double distanciaKM;

    /**
     * Metodo constructor de la clase abstracta Pedido
     * @param idpedido
     * @param direccionEntrega
     * @param distanciaKM
     */
    public Pedido(int idpedido, String direccionEntrega, double distanciaKM) {
        this.idpedido = idpedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKM = distanciaKM;
    }

    public int getIdpedido() {
        return idpedido;
    }
    public String getDireccionEntrega() {
        return direccionEntrega;
    }
    public double getDistanciaKM() {
        return distanciaKM;
    }

    public void mostrarResumen(){
        System.out.println("ID de Pedido: " + idpedido);
        System.out.println("Direccion de entrega: " + direccionEntrega);
        System.out.println("Distancia del restaurante al destino: " + distanciaKM);
    }

    public abstract void calcularTiempoEntrega();
}

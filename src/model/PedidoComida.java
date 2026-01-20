package model;

public class PedidoComida extends Pedido{
    private String nombrerestaurante;

    /**
     * Metodo constructor clase PedidoComida
     * @param idpedido
     * @param direccionEntrega
     * @param distanciaKM
     * @param nombrerestaurante
     */

    public PedidoComida(int idpedido, String direccionEntrega, double distanciaKM, String nombrerestaurante) {
        super(idpedido, direccionEntrega, distanciaKM);
        this.nombrerestaurante = nombrerestaurante;
    }

    public String getNombrerestaurante() {
        return nombrerestaurante;
    }

    @Override
    public void calcularTiempoEntrega() {
        double distancia = getDistanciaKM();
        double tiempoentrega = 15 + (2 * distancia); //tiempo en minutos
        System.out.println("Tiempo de entrega estimado: " + (int) tiempoentrega + " min.");
    }

    @Override
    public String toString() {
        return "Tipo de Pedido: Comida" + "\nNombre del restaurante: " + nombrerestaurante;
    }
}

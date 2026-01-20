package model;

public class PedidoEncomienda extends Pedido{

    /**
     * Constructor clase PedidoEncomienda
     * @param idpedido
     * @param direccionEntrega
     * @param distanciaKM
     */
    public PedidoEncomienda(int idpedido, String direccionEntrega, double distanciaKM) {
        super(idpedido, direccionEntrega, distanciaKM);
    }

    @Override
    public void calcularTiempoEntrega() {
        double distancia = getDistanciaKM();
        double tiempoentrega = 20 + (1.5 * distancia); //tiempo en minutos
        System.out.println("Tiempo de entrega estimado: " + (int) tiempoentrega + " min.");
    }

    @Override
    public String toString() {
        return "Tipo de Pedido: Encomienda" + "\n";
    }
}

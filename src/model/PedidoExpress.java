package model;

public class PedidoExpress extends Pedido{
    /**
     * Constructor clase PedidoExpress
     * @param idpedido
     * @param direccionEntrega
     * @param distanciaKM
     */
    public PedidoExpress(int idpedido, String direccionEntrega, double distanciaKM) {
        super(idpedido, direccionEntrega, distanciaKM);
    }

    @Override
    public void calcularTiempoEntrega() {
        double distancia = getDistanciaKM();
        int tiempoentrega = 10;
        if (distancia > 5){
            tiempoentrega = 15;
        }
        System.out.println("Tiempo de entrega estimado: " +  tiempoentrega + " min.");
    }

    @Override
    public String toString() {
        return "Tipo de pedido: Express" + "\n";
    }
}

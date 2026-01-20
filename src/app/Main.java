package app;

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sel = 0;

        Boolean ciclo1 = true;
        while(ciclo1){
            System.out.println("""
                Que tipo de pedido desea realizar?
                1) Comida
                2) Encomienda (peso debe ser maximo o inferior a 20 KG)
                3) Express (supermercados o farmacia)
                4) Salir
                """);
            String sel_str = sc.nextLine();
            try {
                sel = Integer.parseInt(sel_str);
            } catch (NumberFormatException e) {
                System.out.println("Formato de seleccion incorrecto...");
                continue;
            }
            switch (sel) {
                case 1:
                    Pedido pedido1 = new PedidoComida(1, "Avenida Antonio Varas 666", 5, "Aji Seco");
                    System.out.println(pedido1);
                    pedido1.mostrarResumen();
                    pedido1.calcularTiempoEntrega();
                    System.out.println("---------------");
                    System.out.println();
                    break;
                case 2:
                    Pedido pedido2 = new PedidoEncomienda(2, "Vickuña Mackenna 123", 10);
                    System.out.println(pedido2);
                    pedido2.mostrarResumen();
                    pedido2.calcularTiempoEntrega();
                    System.out.println("---------------");
                    System.out.println();
                    break;
                case 3:
                    Pedido pedido3 = new PedidoExpress(3,"Avenida Siempre Viva 123", 3);
                    System.out.println(pedido3);
                    pedido3.mostrarResumen();
                    pedido3.calcularTiempoEntrega();
                    System.out.println("---------------");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("El programa se cerrara en unos segundos");
                    ciclo1 = false;
                    break;
                default:
                    System.out.println("Favor seleccione una opcion valida...");
            }
        }
    }
}
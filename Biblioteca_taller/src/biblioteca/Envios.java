/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author ostoc
 */




public class Envios {
    public static void main(String[] args) {
        // --- Etapa 2 ---
        Paquete p1 = new Paquete("P-001", "Manizales", 3.0, true);
        p1.mostrarInformacion();

        // --- Etapa 3 ---
        Paquete p2 = new Paquete("P-002", "Pereira");
        Paquete p3 = new Paquete("P-003");
        p2.mostrarInformacion();
        p3.mostrarInformacion();

        // --- Etapa 4 ---
        p3.actualizarPeso(2.5);
        double total = p1.calcularCosto() + p2.calcularCosto() + p3.calcularCosto();
        System.out.println("Total del envío: " + total);

        // --- Etapa 5 ---
        System.out.println(p1.calcularCosto(4000));
        System.out.println(p2.calcularCosto(4000));

        // --- Parte C (Pruebas de retos) ---
        p1.mostrarInformacion("--- DETALLES DEL PAQUETE ---");
        
        if (p1.esPesado()) {
            System.out.println("Aviso: El paquete " + p1.codigo + " requiere manejo especial.");
        } else {
            System.out.println("El paquete " + p1.codigo + " tiene manejo estándar.");
        }
    }
}
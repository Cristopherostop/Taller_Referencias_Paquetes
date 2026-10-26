/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author ostoc
 */



public class Hotel {
    public static void main(String[] args) {
        // Crear al menos tres habitaciones usando los dos constructores
        Habitacion h1 = new Habitacion(101, "Simple", 120000.0, false);
        Habitacion h2 = new Habitacion(102, "Doble");
        Habitacion h3 = new Habitacion(103, "Suite", 250000.0, false);

        // Ocupar una habitación
        h2.ocupar();

        // Mostrar la información de todas
        h1.mostrarInformacion();
        h2.mostrarInformacion();
        h3.mostrarInformacion();

        System.out.println("---------------------------------------------------");

        // Imprimir el valor de una estadía de 3 noches con y sin descuento para h1
        int noches = 3;
        double costoSinDescuento = h1.calcularEstadia(noches);
        double costoConDescuento = h1.calcularEstadia(noches, 10.0); // 10% de descuento

        System.out.println("Estadía de " + noches + " noches sin descuento: " + costoSinDescuento);
        System.out.println("Estadía de " + noches + " noches con 10% de descuento: " + costoConDescuento);
    }
}
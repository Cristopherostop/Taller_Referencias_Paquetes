/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author ostoc
 */



public class Habitacion {
    int numero;
    String tipo;
    double precioNoche;
    boolean ocupada;

    // Constructor completo que recibe los cuatro datos usando this
    public Habitacion(int numero, String tipo, double precioNoche, boolean ocupada) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.ocupada = ocupada;
    }

    // Constructor que recibe solo número y tipo (delega con this)
    public Habitacion(int numero, String tipo) {
        this(numero, tipo, 120000.0, false);
    }

    // Método para marcar la habitación como ocupada
    public void ocupar() {
        this.ocupada = true;
    }

    // Método para verificar si está disponible
    public boolean estaDisponible() {
        return !this.ocupada;
    }

    // Método calcularEstadia con un parámetro
    public double calcularEstadia(int noches) {
        return this.precioNoche * noches;
    }

    // Sobrecarga calcularEstadia con descuento (porcentaje, ej: 10 para 10%)
    public double calcularEstadia(int noches, double descuento) {
        double subtotal = this.calcularEstadia(noches);
        double valorDescuento = subtotal * (descuento / 100.0);
        return subtotal - valorDescuento;
    }

    // Método mostrarInformacion
    public void mostrarInformacion() {
        System.out.println("Habitación " + numero + " (" + tipo + ") | Precio por noche: " + precioNoche + " | Ocupada: " + ocupada);
    }
}

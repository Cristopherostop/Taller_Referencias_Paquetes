/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author ostoc
 */

public class Biblioteca {
    public static void main(String[] args) {
        // --- Etapa 1 ---
        Libro l1 = new Libro("Cien años de soledad", "García Márquez");
        l1.mostrarInformacion();

        // --- Etapa 2 ---
        Libro l2 = l1;
        Libro l3 = new Libro("Cien años de soledad", "García Márquez");
        l2.prestar();

        System.out.println(l1.estaDisponible());
        System.out.println(l3.estaDisponible());
        System.out.println(l1 == l2);
        System.out.println(l1 == l3);

        // --- Etapa 3 ---
        Libro l4 = null;
        if (l4 != null) {
            l4.mostrarInformacion();
        } else {
            System.out.println("No hay libro");
        }

        // --- Etapa 4 ---
        l1.setTitulo("");
        System.out.println(l1.getTitulo());

        Libro l5 = new Libro("", "Anónimo");
        System.out.println(l5.getTitulo());

        // --- Etapa 5 ---
        Socio camila = new Socio("Camila");
        camila.prestarLibro(l3);
        camila.prestarLibro(l1);
        camila.prestarLibro(null);

        System.out.println(camila.getLibrosPrestados());
        System.out.println(l3.estaDisponible());
    }
}
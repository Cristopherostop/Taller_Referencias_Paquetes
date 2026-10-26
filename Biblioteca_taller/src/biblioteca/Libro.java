/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author ostoc
 */




public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        setTitulo(titulo);
        this.autor = autor;
        this.disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println(titulo + " de " + autor + " | disponible: " + disponible);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Título inválido");
            this.titulo = "Sin título";
        } else {
            this.titulo = titulo;
        }
    }

    public boolean mismoTitulo(Libro otro) {
        if (otro == null) {
            return false;
        }
        return this.titulo.equals(otro.getTitulo());
    }
}
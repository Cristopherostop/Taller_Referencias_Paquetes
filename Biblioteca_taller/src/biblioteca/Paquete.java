package biblioteca;

public class Paquete {
    String codigo;
    String destino;
    double peso;
    boolean asegurado;

    public Paquete(String codigo, String destino, double peso, boolean asegurado) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.asegurado = asegurado;
    }

    public Paquete(String codigo, String destino) {
        this(codigo, destino, 1.0, false);
    }

    public Paquete(String codigo) {
        this(codigo, "Por asignar");
    }

    public void mostrarInformacion() {
        System.out.println(codigo + " -> " + destino + " | " + peso + " kg | asegurado: " + asegurado);
    }

    public void mostrarInformacion(String encabezado) {
        System.out.println(encabezado);
        this.mostrarInformacion();
    }

    public void actualizarPeso(double peso) {
        this.peso = peso;
    }

    public double calcularCosto() {
        double costoBase = this.peso * 5000;
        if (this.asegurado) {
            costoBase += 8000;
        }
        return costoBase;
    }

    public double calcularCosto(double tarifaPorKilo) {
        double costoBase = this.peso * tarifaPorKilo;
        if (this.asegurado) {
            costoBase += 8000;
        }
        return costoBase;
    }

    public boolean esPesado() {
        return this.peso > 5.0;
    }
}
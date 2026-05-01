public class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    // SETTERS con validación
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        }
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula > 0) {
            this.valorMatricula = valorMatricula;
        }
    }

    // GETTERS
    public double getPromedio() {
        return promedio;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    // MÉTODOS
    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matrícula: $" + valorMatricula);
    }

    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }

    public double calcularPagoFinal() {
        return valorMatricula;
    }

    // SOBRECARGA
    public double calcularPagoFinal(double descuentoExtra) {
        return valorMatricula - descuentoExtra;
    }
}

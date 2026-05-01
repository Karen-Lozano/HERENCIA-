public class PersonaAcademica {
    protected String codigo;
    protected String nombre;
    protected int edad;

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        }
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void describirRol() {
        System.out.println("Rol: Persona académica.");
    }

    public double calcularPago() {
        return 0;
    }
}

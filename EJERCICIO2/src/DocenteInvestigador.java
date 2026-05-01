public class DocenteInvestigador extends Docente {
    private int publicaciones;

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        }
    }

    @Override
    public double calcularPago() {
        return super.calcularPago() + (publicaciones * 20);
    }

    // SOBRECARGA
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con producción académica.");
    }
}
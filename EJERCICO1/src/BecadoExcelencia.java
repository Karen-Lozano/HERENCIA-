public class BecadoExcelencia extends EstudianteBecado {
    private double bonoExcelencia;

    public void setBonoExcelencia(double bonoExcelencia) {
        if (bonoExcelencia >= 0) {
            this.bonoExcelencia = bonoExcelencia;
        }
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bonoExcelencia;
        return Math.max(pago, 0); // no negativo
    }
}
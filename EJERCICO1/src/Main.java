import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BecadoExcelencia est1 = new BecadoExcelencia();

        System.out.print("Código: ");
        est1.setCodigo(sc.nextLine());

        System.out.print("Nombre: ");
        est1.setNombre(sc.nextLine());

        System.out.print("Promedio: ");
        est1.setPromedio(sc.nextDouble());

        System.out.print("Matrícula: ");
        est1.setValorMatricula(sc.nextDouble());

        System.out.print("Porcentaje beca: ");
        est1.setPorcentajeBeca(sc.nextDouble());

        System.out.print("Bono excelencia: ");
        est1.setBonoExcelencia(sc.nextDouble());

        // POLIMORFISMO
        Estudiante ref = est1;

        ref.mostrarDatos();
        System.out.println("Pago final: $" + ref.calcularPagoFinal());
    }
}

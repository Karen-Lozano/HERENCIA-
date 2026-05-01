import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DocenteInvestigador doc = new DocenteInvestigador();

        System.out.print("Código: ");
        doc.codigo = sc.nextLine();

        System.out.print("Nombre: ");
        doc.nombre = sc.nextLine();

        System.out.print("Edad: ");
        doc.setEdad(sc.nextInt());

        System.out.print("Horas: ");
        doc.setHorasClase(sc.nextInt());

        System.out.print("Valor hora: ");
        doc.valorHora = sc.nextDouble();

        System.out.print("Publicaciones: ");
        doc.setPublicaciones(sc.nextInt());

        // POLIMORFISMO
        PersonaAcademica ref = doc;

        ref.mostrarDatos();
        ref.describirRol();
        System.out.println("Pago: $" + ref.calcularPago());

        System.out.println("Pago con bono: $" + doc.calcularPago(50));
    }
}

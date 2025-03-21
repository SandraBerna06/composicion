import java.util.Scanner;

public class mainej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de tóner:");
        int toner = sc.nextInt();
        System.out.println("Introduce el número de páginas a imprimir:");
        int numeroPagina = sc.nextInt();
        System.out.println("¿Impresión a doble cara? (true/false):");
        boolean dobleCara = sc.nextBoolean();

        Impresora impresora1 = new Impresora(toner, 2, dobleCara);

        System.out.println("Tóner inicial: " + impresora1.getToner());
        impresora1.cantidadToner(0);
        System.out.println("Tóner tras intentar añadir: " + impresora1.getToner());

        System.out.println("----------");
        System.out.println("Páginas iniciales: " + impresora1.getNumeroPagina());
        int paginasUsadas = impresora1.cantidadPagina(numeroPagina);
        System.out.println("Páginas usadas: " + paginasUsadas);
        System.out.println("Total de páginas impresas: " + impresora1.getNumeroPagina());

    }
}

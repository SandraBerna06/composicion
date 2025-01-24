import java.util.Scanner;

public class mainej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de tóner:");
        int toner = sc.nextInt();
        System.out.println("Introduce el número de páginas a imprimir:");
        int numeroPagina=sc.nextInt();

        Impresora impresora1 = new Impresora(toner, 2, false);

        System.out.println(impresora1.getToner());
        impresora1.cantidadToner(0);
        System.out.println(impresora1.getToner());

        System.out.println("----------");
        System.out.println(impresora1.getNumeroPagina());
        impresora1.cantidadPagina(7);
        System.out.println(impresora1.getNumeroPagina());
    }
}

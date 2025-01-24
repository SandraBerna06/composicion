import java.util.Scanner;

public class Impresora {

    private int toner;
    private int numeroPagina;
    private boolean dobleCara;

    public Impresora(int toner, int numeroPagina, boolean dobleCara) {
        this.toner = toner;
        this.numeroPagina = numeroPagina;
        this.dobleCara = dobleCara;
    }

    public int getToner() {
        return toner;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public boolean getDobleCara() {
        return dobleCara;
    }

    public void cantidadToner(int cantidad) {

        if (cantidad < 0 || cantidad > 100){
            System.out.println("CANTIDAD INVALIIDA");
        } else if (this.toner + cantidad > 100) {
            this.toner = 100;
        } else {
            this.toner = cantidad + this.toner;
        }
    }

        public void cantidadPagina(int numeroPagina){
            if(numeroPagina%2!=0 && dobleCara == true){
                int paginasTotal = (numeroPagina/2)+1;
                this.numeroPagina = this.numeroPagina + paginasTotal;
                System.out.println(paginasTotal);
            } else if (numeroPagina%2==0 && dobleCara == true) {
                int paginasTotal=(numeroPagina/2);
                this.numeroPagina = this.numeroPagina + paginasTotal;
                System.out.println(paginasTotal);
            }else{
                System.out.println(numeroPagina);
                this.numeroPagina = this.numeroPagina + numeroPagina;
            }
        }
}

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

    public boolean isDobleCara() {
        return dobleCara;
    }

    public void cantidadToner(int cantidad) {
        if (cantidad < 0 || cantidad > 100) {
            System.out.println("CANTIDAD INVÁLIDA");
        } else if (this.toner + cantidad > 100) {
            this.toner = 100;
        } else {
            this.toner += cantidad;
        }
    }

    public int cantidadPagina(int paginasAImprimir) {
        int paginasUsadas;
        if (dobleCara) {
            paginasUsadas = (paginasAImprimir + 1) / 2; // Redondeo hacia arriba para impares
        } else {
            paginasUsadas = paginasAImprimir;
        }
        this.numeroPagina += paginasUsadas;
        return paginasUsadas;
    }
}

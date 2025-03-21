import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpresoraTest {
    @Test
    void testImprimirDobleCaraActivada() {
        Impresora impresora = new Impresora(20, 3, true);
        int entrada = 10;
        int salidaEsperada = 5;
        int salidaRecibida = impresora.cantidadPagina(entrada);

        assertEquals(salidaEsperada, salidaRecibida, "Error en la impresión a doble cara");

        if (salidaRecibida == salidaEsperada) {
            System.out.println("La impresora funciona bien");
        } else {
            System.err.println("La impresora no funciona.\n" +
                    "- Resultado esperado = " + salidaEsperada + "\n" +
                    "- Resultado recibido = " + salidaRecibida);
        }
    }
    @Test
    void testConstructor() {
        Impresora impresora = new Impresora(50, 10, true);
        assertEquals(50, impresora.getToner(), "Error en el valor inicial de tóner");
        assertEquals(10, impresora.getNumeroPagina(), "Error en el valor inicial de páginas");
        assertTrue(impresora.isDobleCara(), "Error en la configuración de doble cara");
    }

    @Test
    void testImprimirDobleCaraPar() {
        Impresora impresora = new Impresora(50, 0, true);
        int paginasImpresas = impresora.cantidadPagina(10);
        assertEquals(5, paginasImpresas, "Error al imprimir 10 páginas en doble cara");
        assertEquals(5, impresora.getNumeroPagina(), "Error en el conteo total de páginas después de imprimir");
    }

    @Test
    void testImprimirDobleCaraImpar() {
        Impresora impresora = new Impresora(50, 0, true);
        int paginasImpresas = impresora.cantidadPagina(7);
        assertEquals(4, paginasImpresas, "Error al imprimir 7 páginas en doble cara");
        assertEquals(4, impresora.getNumeroPagina(), "Error en el conteo total de páginas después de imprimir");
    }

    @Test
    void testImprimirSinDobleCara() {
        Impresora impresora = new Impresora(50, 0, false);
        int paginasImpresas = impresora.cantidadPagina(10);
        assertEquals(10, paginasImpresas, "Error al imprimir 10 páginas sin doble cara");
        assertEquals(10, impresora.getNumeroPagina(), "Error en el conteo total de páginas después de imprimir");
    }

    @Test
    void testCantidadTonerDentroDeRango() {
        Impresora impresora = new Impresora(30, 0, false);
        impresora.cantidadToner(20);
        assertEquals(50, impresora.getToner(), "Error al añadir tóner dentro del rango permitido");
    }

    @Test
    void testCantidadTonerExcedeMaximo() {
        Impresora impresora = new Impresora(90, 0, false);
        impresora.cantidadToner(20);
        assertEquals(100, impresora.getToner(), "Error al evitar que el tóner supere el 100%");
    }

    @Test
    void testCantidadTonerNegativo() {
        Impresora impresora = new Impresora(50, 0, false);
        impresora.cantidadToner(-10);
        assertEquals(50, impresora.getToner(), "Error al manejar una cantidad de tóner negativa");
    }

    @Test
    void testCantidadTonerMayorA100() {
        Impresora impresora = new Impresora(50, 0, false);
        impresora.cantidadToner(200);
        assertEquals(50, impresora.getToner(), "Error al evitar cantidades de tóner mayores a 100");
    }

    @Test
    void testGetToner() {
        Impresora impresora = new Impresora(75, 0, false);
        assertEquals(75, impresora.getToner(), "Error en getToner()");
    }

    @Test
    void testGetNumeroPagina() {
        Impresora impresora = new Impresora(50, 5, false);
        assertEquals(5, impresora.getNumeroPagina(), "Error en getNumeroPagina()");
    }

    @Test
    void testIsDobleCaraTrue() {
        Impresora impresora = new Impresora(50, 0, true);
        assertTrue(impresora.isDobleCara(), "Error en isDobleCara() cuando es true");
    }

    @Test
    void testIsDobleCaraFalse() {
        Impresora impresora = new Impresora(50, 0, false);
        assertFalse(impresora.isDobleCara(), "Error en isDobleCara() cuando es false");
    }
}
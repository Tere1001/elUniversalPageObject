package mx.com.eluniversal.pruebas;

import org.junit.Test;

public class TipoDeCambioTest extends BaseTest {
    @Test
    public void testTipoDeCambio() {
        home.navegarPagina();
        home.verificarHomePage();
        home.verificarPorcentajes();
        home.verificarTipoCambio();
    }
}


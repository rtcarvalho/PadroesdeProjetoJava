package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmePadraoTest {

    @Test
    void deveRetornarValorTotalFilme() {
        FilmePadrao filmePadrao = new FilmePadrao();
        filmePadrao.setValorParcial(21.0f);

        assertEquals(21.0f, filmePadrao.calcularValor());
    }

    @Test
    void  deveRetornarInformacoes() {
        FilmePadrao filmePadrao = new FilmePadrao();
        filmePadrao.setValorParcial(21.0f);
        filmePadrao.setNome("Codigo de Conduta");
        filmePadrao.setHorario("22H");
        filmePadrao.setSala("Sala 2");

        assertEquals("Filme{nome='Codigo de Conduta', horario=22H', valor=21.0}", filmePadrao.getInfo());
    }
}

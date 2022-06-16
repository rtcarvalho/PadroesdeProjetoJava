package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenhoTest {
    @Test
    void deveRetornarValorTotalDesenho() {
        Desenho desenho = new Desenho();
        desenho.setValorParcial(10.0f);

        assertEquals(20.5f, desenho.calcularValor());
    }

    @Test
    void  deveRetornarInformacoes() {
        Desenho desenho = new Desenho();
        desenho.setValorParcial(10.0f);
        desenho.setNome("Meu Malvado Favorito");
        desenho.setHorario("21H");
        desenho.setSala("Sala 2");

        assertEquals("Desenho{nome='Meu Malvado Favorito', horario=21H', valor=20.5}", desenho.getInfo());
    }
}

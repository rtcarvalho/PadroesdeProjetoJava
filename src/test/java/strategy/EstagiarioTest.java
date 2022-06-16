package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstagiarioTest {

    @Test
    void deveSomarSalarioEstagiario() {
        Estagiario estagiario = new Estagiario();
        estagiario.somarSalario(22.0f, 40.0f);
        assertEquals(880.0f, estagiario.getSalario());
    }

    @Test
    void naoDeveCalcularSalarioHorasMenorZero() {
        try {
            Estagiario estagiario = new Estagiario();
            estagiario.somarSalario(22.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

}

package memento;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void deveArmazenarEstados() {
        Empregado empregado = new Empregado();
        empregado.setEstado(EmpregadoEstadoTrabalhando.getInstance());
        empregado.setEstado(EmpregadoEstadoFerias.getInstance());
        assertEquals(2, empregado.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Empregado empregado = new Empregado();
        empregado.setEstado(EmpregadoEstadoTrabalhando.getInstance());
        empregado.setEstado(EmpregadoEstadoFerias.getInstance());
        empregado.restauraEstado(0);
        assertEquals(EmpregadoEstadoTrabalhando.getInstance(), empregado.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Empregado empregado = new Empregado();
        empregado.setEstado(EmpregadoEstadoTrabalhando.getInstance());
        empregado.setEstado(EmpregadoEstadoFerias.getInstance());
        empregado.setEstado(EmpregadoEstadoAfastado.getInstance());
        empregado.restauraEstado(1);
        assertEquals(EmpregadoEstadoFerias.getInstance(), empregado.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Empregado empregado = new Empregado();
            empregado.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}

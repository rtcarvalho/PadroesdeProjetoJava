package observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {

    @Test
    void deveNotificarUmCliente() {
        HBO hbo = new HBO("Amnesia", "ação");
        Cliente cliente = new Cliente("Raphael");
        cliente.cadastrar(hbo);
        hbo.notificarFilmeNovo();
        assertEquals(
                "Raphael, temos um novo filme na HBO{filme=Amnesia, gênero=ação}",
                cliente.getUltimaNotificacao()
        );
    }

    @Test
    void deveNotificarTodosClientes() {
        HBO hbo = new HBO("Amnesia", "ação");
        Cliente cliente1 = new Cliente("Raphael");
        Cliente cliente2 = new Cliente("Evelyn");
        cliente1.cadastrar(hbo);
        cliente2.cadastrar(hbo);
        hbo.notificarFilmeNovo();
        assertEquals(
                "Raphael, temos um novo filme na HBO{filme=Amnesia, gênero=ação}",
                cliente1.getUltimaNotificacao()
        );
        assertEquals(
                "Evelyn, temos um novo filme na HBO{filme=Amnesia, gênero=ação}",
                cliente2.getUltimaNotificacao()
        );
    }

    @Test
    void naoDeveNotificarCliente() {
        HBO hbo = new HBO("Amnesia", "ação");
        Cliente cliente = new Cliente("Raphael");
        hbo.notificarFilmeNovo();
        assertEquals(
                null,
                cliente.getUltimaNotificacao()
        );
    }
}

package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SocioTest {

    @Test
    void deveElogiarEmpresa() {
        Socio socio = new Socio();
        assertEquals("A Ouvidoria agradece o seu contato.\nA Empresa respondeu a sua demanda conforme mensagem a seguir.\n" +
                        ">>A Empresa agradece a mensagem: Uma excelente infraestrutura!",
                socio.elogiarEmpresa("Uma excelente infraestrutura!"));
    }

    @Test
    void deveReclamarEmpresa() {
        Socio socio = new Socio();
        assertEquals("A Ouvidoria agradece o seu contato.\nA Empresa respondeu a sua demanda conforme mensagem a seguir.\n" +
                        ">>A Empresa vai procurar melhorar o serviço da reclamação: Demora no atendimento",
                socio.reclamarEmpresa("Demora no atendimento"));
    }

    @Test
    void deveSugerirEmpresa() {
        Socio socio = new Socio();
        assertEquals("A Ouvidoria agradece o seu contato.\nA Empresa respondeu a sua demanda conforme mensagem a seguir.\n" +
                        ">>A Empresa agradece a mensagem: Deve melhorar o saguão",
                socio.sugerirEmpresa("Deve melhorar o saguão"));
    }

}
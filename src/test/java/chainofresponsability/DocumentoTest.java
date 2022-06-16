package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    EmpregadoSupervisor supervisor;
    EmpregadoDiretor diretor;

    @BeforeEach
    void setUp() {
        diretor = new EmpregadoDiretor(null);
        supervisor = new EmpregadoSupervisor(diretor);
    }

    @Test
    void deveRetornarSupervisorParaAssinaturaPonto() {
        assertEquals("Supervisor", supervisor.assinarDocumento(new Documento(TipoDocumentoAssinaturaPonto.getTipoDocumentoAssinaturaPonto())));
    }

    @Test
    void deveRetornarDiretorParaContratarEmpregado() {
        assertEquals("Diretor", diretor.assinarDocumento(new Documento(TipoDocumentoContrato.getTipoDocumentoContrato())));
    }

    @Test
    void deveRetornarDiretorParaRescindirContratoEmpregado() {
        assertEquals("Diretor", diretor.assinarDocumento(new Documento(TipoDocumentoRescisaoContrato.getTipoDocumentoRescisaoContrato())));
    }

}

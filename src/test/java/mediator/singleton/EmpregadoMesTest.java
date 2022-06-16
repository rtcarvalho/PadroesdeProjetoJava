package mediator.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpregadoMesTest {

    @Test
    public void deveRetornarMes() {
        Singleton.EmpregadoMes.getInstance().setMes("Dezembro");
        assertEquals("Dezembro", Singleton.EmpregadoMes.getInstance().getMes());
    }

    @Test
    public void deveRetornarNomeFuncionario() {
        Singleton.EmpregadoMes.getInstance().setNomeEmpregado("Renato");
        assertEquals("Renato", Singleton.EmpregadoMes.getInstance().getNomeEmpregadoo());
    }
}
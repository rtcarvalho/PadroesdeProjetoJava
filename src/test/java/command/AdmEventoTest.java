package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdmEventoTest {

    command.AdmEvento admEvento;
    InscricoesEvento inscricoesEvento;

    @BeforeEach
    void setUp() {
        admEvento = new command.AdmEvento();
        inscricoesEvento = new InscricoesEvento ("INTEL EXTREME MASTERS", 2022);
    }

    @Test
    void deveAbrirInscricao() {
        Tarefa abrirInscricoes = new AbrirIscricoes(inscricoesEvento);
        admEvento.executarTarefa(abrirInscricoes);

        assertEquals("As inscrições estão abertas", inscricoesEvento.getSituacao());
    }

    @Test
    void deveFecharInscricao() {
        Tarefa fecharInscricoes = new FecharInscricoes(inscricoesEvento);
        admEvento.executarTarefa(fecharInscricoes);

        assertEquals("As inscrições estão fechadas", inscricoesEvento.getSituacao());
    }

    @Test
    void deveCancelarFechamentoInscricao() {
        Tarefa abrirInscricoes = new AbrirIscricoes(inscricoesEvento);
        Tarefa fecharInscricoes = new FecharInscricoes(inscricoesEvento);

        admEvento.executarTarefa(abrirInscricoes);
        admEvento.executarTarefa(fecharInscricoes);

        admEvento.cancelarUltimaTarefa();

        assertEquals("As inscrições estão abertas", inscricoesEvento.getSituacao());
    }

}

package command;

public class FecharInscricoes implements Tarefa {

    private InscricoesEvento inscricoesEvento;

    public FecharInscricoes(InscricoesEvento inscricoesEvento) {
        this.inscricoesEvento = inscricoesEvento;
    }

    public void executar() {
        this.inscricoesEvento.fecharInscricoes();
    }

    public void cancelar() {
        this.inscricoesEvento.abrirInscricoes();
    }

}

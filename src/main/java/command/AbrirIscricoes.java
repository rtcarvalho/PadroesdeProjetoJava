package command;

public class AbrirIscricoes implements Tarefa {

    private InscricoesEvento inscricoesEvento;

    public AbrirIscricoes(InscricoesEvento inscricoesEvento) {
        this.inscricoesEvento = inscricoesEvento;
    }

    public void executar() {
        this.inscricoesEvento.abrirInscricoes();
    }

    public void cancelar() {
        this.inscricoesEvento.fecharInscricoes();
    }

}


package command;

public class InscricoesEvento {

    private String nome;
    private int ano;
    private String situacao;

    public InscricoesEvento(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirInscricoes() {
        this.situacao = "As inscrições estão abertas";
    }

    public void fecharInscricoes() {
        this.situacao = "As inscrições estão fechadas";
    }

}
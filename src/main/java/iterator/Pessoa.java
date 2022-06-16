package iterator;

public class Pessoa {

    private String nome;
    private String bairro;
    private boolean morando;

    public Pessoa(String nome, String bairro, boolean morando) {
        this.nome = nome;
        this.bairro = bairro;
        this.morando = morando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public boolean isMorando() {
        return morando;
    }

    public void setMorando(boolean morando) {
        this.morando = morando;
    }
}

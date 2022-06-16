package visitor;

public class Profissional implements Pessoa {

    private String nome;
    private String salario;
    private Equipe equipe;

    public Profissional(String nome, String salario, Equipe equipe) {
        this.nome = nome;
        this.salario = salario;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return salario;
    }

    public String getNomeTime() {
        return this.equipe.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProfissional(this);
    }

}

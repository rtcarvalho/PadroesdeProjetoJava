package visitor;

public class ChefeEquipe implements Pessoa {

    private String nome;
    private String salario;
    private Equipe equipe;

    public ChefeEquipe(String nome, String salario, Equipe equipe) {
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

    public String getNomeEquipe() {
        return this.equipe.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirChefeEquipe(this);
    }

}

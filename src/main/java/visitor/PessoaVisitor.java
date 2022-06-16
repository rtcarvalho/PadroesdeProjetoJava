package visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirProfissional(Profissional profissional) {
        return "Profissional{" +
                "nome=" + profissional.getNome() +
                ", salario='" + profissional.getSalario() + '\'' +
                ", equipe=" + profissional.getNomeTime() +
                '}';
    }

    @Override
    public String exibirChefeEquipe(ChefeEquipe chefeEquipe) {
        return "Chefe de Equipe{" +
                "nome=" + chefeEquipe.getNome() +
                ", salario='" + chefeEquipe.getSalario() + '\'' +
                ", equipe=" + chefeEquipe.getNomeEquipe() +
                '}';
    }
}

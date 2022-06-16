package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirProfissional() {
        Profissional profissional = new Profissional("Lewis Hamilton", "4.166.600,00", new Equipe("Mercedes-AMG"));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Profissional{nome=Lewis Hamilton, salario='4.166.600,00', equipe=Mercedes-AMG}", visitor.exibir(profissional));
    }

    @Test
    void deveExibirChefeEquipe() {
        ChefeEquipe chefeEquipe = new ChefeEquipe("Toto Wolf", "5.700.000,00", new Equipe("Mercedes-AMG"));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Chefe de Equipe{nome=Toto Wolf, salario='5.700.000,00', equipe=Mercedes-AMG}", visitor.exibir(chefeEquipe));
    }

}

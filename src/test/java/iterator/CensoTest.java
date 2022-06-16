package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarPessoasMorandoCidade(){
        Cidade cidade = new Cidade(
                new Pessoa("Andre", "Centro", true),
                new Pessoa("Felipe", "Centro", true),
                new Pessoa("Marcelo", "Jardin Novo Rodeio",false),
                new Pessoa("Camila", "Jardin Novo Rodeio",true)

        );
        assertEquals(3, Censo.pessoasMorandoCidade(cidade));
    }

    @Test
    void deveContarPessoasMorandoBairro(){
        Cidade cidade = new Cidade(
                new Pessoa("Andre", "Centro", true),
                new Pessoa("Felipe", "Centro", true),
                new Pessoa("Marcelo", "Jardin Novo Rodeio",false),
                new Pessoa("Camila", "Jardin Novo Rodeio",true)

        );
        assertEquals(2, Censo.pessoasMorandoBairro(cidade, "Centro"));
    }

    @Test
    void deveContarPessoasCidade(){
        Cidade cidade = new Cidade(
                new Pessoa("Andre", "Centro", true),
                new Pessoa("Felipe", "Centro", true),
                new Pessoa("Marcelo", "Jardin Novo Rodeio",false),
                new Pessoa("Camila", "Jardin Novo Rodeio",true)

        );
        assertEquals(4, Censo.totalPessoasCidade(cidade));
    }

}

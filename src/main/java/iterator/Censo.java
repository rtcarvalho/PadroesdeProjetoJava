package iterator;

import java.util.Iterator;

public class Censo {

    public static Integer pessoasMorandoCidade(Cidade cidade) {
        int quantidade = 0;
        for (Pessoa pessoa : cidade) {
            if (pessoa.isMorando()){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer totalPessoasCidade(Cidade cidade) {
        int quantidade = 0;
        for (Iterator a = cidade.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

    public static Integer pessoasMorandoBairro(Cidade cidade, String bairro) {
        int quantidade = 0;
        for (Pessoa pessoa : cidade) {
            if (pessoa.isMorando() && pessoa.getBairro() == bairro){
                quantidade++;
            }
        }
        return quantidade;
    }
}

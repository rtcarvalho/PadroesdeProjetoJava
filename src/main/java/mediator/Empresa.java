package mediator;

public class Empresa implements Setor {

    private static Empresa instancia = new Empresa();

    private Empresa() {}

    public static Empresa getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Empresa vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Empresa agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Empresa vai analisar a sugestão: " + mensagem;
    }

}


package mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioEmpresa(String mensagem) {
        return "A Ouvidoria agradece o seu contato.\n"+
                "A Empresa respondeu a sua demanda conforme mensagem a seguir.\n" +
                ">>" + Empresa.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoEmpresa(String mensagem) {
        return "A Ouvidoria agradece o seu contato.\n"+
                "A Empresa respondeu a sua demanda conforme mensagem a seguir.\n" +
                ">>" + Empresa.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoEmpresa(String mensagem) {
        return "A Ouvidoria agradece o seu contato.\n"+
                "A Empresa respondeu a sua demanda conforme mensagem a seguir.\n" +
                ">>" + Empresa.getInstancia().receberSugestao(mensagem);
    }

}

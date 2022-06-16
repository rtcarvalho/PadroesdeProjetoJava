package mediator;

public class Pessoa {

    public String elogiarEmpresa(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioEmpresa(mensagem);
    }

    public String reclamarEmpresa(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoEmpresa(mensagem);
    }

    public String sugerirEmpresa(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioEmpresa(mensagem);
    }

}

package state;

public class FuncionarioEstadoDemitido implements FuncionarioEstado {

    private FuncionarioEstadoDemitido() {};
    private static FuncionarioEstadoDemitido instance = new FuncionarioEstadoDemitido();
    public static FuncionarioEstadoDemitido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Demitido";
    }

    public String contratar(Funcionario funcionario) {
        return "Contratacao não realizada";
    }

    public String licenca(Funcionario funcionario) {
        return "Licenca não realizada";
    }

    public String demitir(Funcionario funcionario) {
        return "Demissao realizada";
    }


}
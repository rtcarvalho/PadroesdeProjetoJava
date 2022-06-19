package state;

public class FuncionarioEstadoLicenca implements FuncionarioEstado {

    private FuncionarioEstadoLicenca() {};
    private static FuncionarioEstadoLicenca instance = new FuncionarioEstadoLicenca();
    public static FuncionarioEstadoLicenca getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Licenca";
    }

    public String contratar(Funcionario funcionario) {
        return "Contrato não realizado";
    }

    public String demitir(Funcionario funcionario) {
        return "Demissao não realizada";
    }

    public String licenca(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        return "Licenca realizada";
    }


}

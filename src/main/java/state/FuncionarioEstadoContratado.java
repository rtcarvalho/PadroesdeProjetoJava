package state;

public class FuncionarioEstadoContratado implements FuncionarioEstado {

    private FuncionarioEstadoContratado() {};
    private static FuncionarioEstadoContratado instance = new FuncionarioEstadoContratado();
    public static FuncionarioEstadoContratado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratado";
    }

    public String contratar(Funcionario funcionario) {
        return "Contrato não realizado";
    }

    public String demitir(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return "Demissao realizada";}

    public String licenca(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        return "Licenca realizada";
    }


}

package memento;

public class EmpregadoEstadoTrabalhando implements EmpregadoEstado {

    private EmpregadoEstadoTrabalhando() {};
    private static EmpregadoEstadoTrabalhando instance = new EmpregadoEstadoTrabalhando();
    public static EmpregadoEstadoTrabalhando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Trabalhando";
    }

}

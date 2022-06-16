package memento;

public class EmpregadoEstadoAfastado implements EmpregadoEstado {

    private EmpregadoEstadoAfastado() {};
    private static EmpregadoEstadoAfastado instance = new EmpregadoEstadoAfastado();
    public static EmpregadoEstadoAfastado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Afastado";
    }

}

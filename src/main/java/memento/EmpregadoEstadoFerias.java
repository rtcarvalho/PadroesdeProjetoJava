package memento;

public class EmpregadoEstadoFerias implements EmpregadoEstado {

    private EmpregadoEstadoFerias() {};
    private static EmpregadoEstadoFerias instance = new EmpregadoEstadoFerias();
    public static EmpregadoEstadoFerias getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Férias";
    }

}

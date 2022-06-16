package chainofresponsability;

public class EmpregadoSupervisor extends Empregado {

    public EmpregadoSupervisor(Empregado superior) {
        listaDocumentos.add(TipoDocumentoAssinaturaPonto.getTipoDocumentoAssinaturaPonto());
        setEmpregadoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }

}


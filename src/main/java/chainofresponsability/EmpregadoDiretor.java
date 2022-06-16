package chainofresponsability;

public class EmpregadoDiretor extends Empregado {

    public EmpregadoDiretor(Empregado superior) {
        listaDocumentos.add(TipoDocumentoContrato.getTipoDocumentoContrato());
        listaDocumentos.add(TipoDocumentoRescisaoContrato.getTipoDocumentoRescisaoContrato());
        setEmpregadoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }

}

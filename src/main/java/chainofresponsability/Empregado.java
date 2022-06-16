package chainofresponsability;

import java.util.ArrayList;

public abstract class Empregado {

    protected ArrayList listaDocumentos = new ArrayList();
    private Empregado empregadoSuperior;

    public void setEmpregadoSuperior(Empregado empregadoSuperior) {
        this.empregadoSuperior = empregadoSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarDocumento(Documento documento) {
        if (listaDocumentos.contains(documento.getTipoDocumento())) {
            return getDescricaoCargo();
        }
        else {
            if (empregadoSuperior != null) {
                return empregadoSuperior.assinarDocumento(documento);
            }
            else
            {
                return "Sem assinatura";
            }
        }
    }

}

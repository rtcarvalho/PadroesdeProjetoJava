package memento;

import java.util.ArrayList;
import java.util.List;

public class Empregado {

    private EmpregadoEstado estado;
    private List<EmpregadoEstado> memento = new ArrayList<EmpregadoEstado>();

    public EmpregadoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(EmpregadoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<EmpregadoEstado> getEstados() {
        return this.memento;
    }

}

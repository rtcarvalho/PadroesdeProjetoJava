package state;

public class Funcionario {

    private String nome;
    private FuncionarioEstado estado;

    public Funcionario() {
        this.estado = FuncionarioEstadoContratado.getInstance();
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public String contratar() {
        return estado.contratar(this);
    }

    public String demitir() {
        return estado.demitir(this);
    }

    public String licenca() {
        return estado.licenca(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }
}

package templatemethod;

public abstract class Filme {

    private String nome;
    private String horario;
    private String sala;
    private float valorParcial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public float getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(float valorParcial) {
        this.valorParcial = valorParcial;
    }

    public abstract float calcularValor();

    public String getTipo() {
        return "Filme";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", horario=" + this.getHorario() + '\'' +
                ", valor=" + this.calcularValor() +
                '}';
    }
}

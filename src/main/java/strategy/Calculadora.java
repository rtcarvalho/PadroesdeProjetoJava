package strategy;

public class Calculadora {

    private float valorHora;
    private float horasTrabalhadasSemana;

    public Calculadora(float valorHora, float horasTrabalhadasSemana) {
        this.valorHora = valorHora;
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
    }

    public float calcular(Operacao operacao) {
        return operacao.calcular(valorHora, horasTrabalhadasSemana);
    }

}

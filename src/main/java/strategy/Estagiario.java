package strategy;

public class Estagiario {

    private float salario;

    public float getSalario() {
        return  salario;
    }

    public void somarSalario(float valorHora, float horasTrabalhadasSemana) {
        Calculadora calculadora = new Calculadora(valorHora, horasTrabalhadasSemana);
        this.salario = calculadora.calcular(new OperacaoSomaSalario());
    }

}
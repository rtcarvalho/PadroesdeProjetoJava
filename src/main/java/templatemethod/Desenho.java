package templatemethod;

public class Desenho extends Filme {

    public float calcularValor() {
        return this.getValorParcial() + 10.50f;
    }

    @Override
    public String getTipo() {
        return "Desenho";
    }
}


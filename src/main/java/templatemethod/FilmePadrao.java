package templatemethod;

public class FilmePadrao extends Filme {

    public float calcularValor() {
        return this.getValorParcial();
    }
}

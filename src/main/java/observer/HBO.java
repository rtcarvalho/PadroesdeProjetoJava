package observer;

import java.util.Observable;

public class HBO extends Observable {

    private String nomeFilme;
    private String genero;

    public HBO(String nomeFilme, String genero) {
        this.nomeFilme = nomeFilme;
        this.genero = genero;
    }

    public void notificarFilmeNovo() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "HBO{" +
                "filme=" + nomeFilme +
                ", gênero=" + genero +
                '}';
    }

}

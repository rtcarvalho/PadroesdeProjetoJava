package observer;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrar(HBO hbo) {
        hbo.addObserver(this);
    }

    public void update(Observable hbo, Object arg1) {
        this.ultimaNotificacao = this.nome + ", temos um novo filme na " + hbo.toString();
    }

}
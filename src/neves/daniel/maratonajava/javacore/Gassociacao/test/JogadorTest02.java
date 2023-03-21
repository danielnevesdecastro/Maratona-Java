package neves.daniel.maratonajava.javacore.Gassociacao.test;

import neves.daniel.maratonajava.javacore.Gassociacao.dominio.Jogador;
import neves.daniel.maratonajava.javacore.Gassociacao.dominio.Time;

//65 ASSOCIAÇÃO, Unidirecional, 1 pra N
public class JogadorTest02 {

    public static void main(String[] args) {
        Jogador j1 = new Jogador("Haaland");
        Time time = new Time("Seleção Brasileira");

        j1.setTime(time);
        j1.imprime();


    }
}

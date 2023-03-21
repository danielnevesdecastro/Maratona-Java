package neves.daniel.maratonajava.javacore.Gassociacao.test;

import neves.daniel.maratonajava.javacore.Gassociacao.dominio.Jogador;
import neves.daniel.maratonajava.javacore.Gassociacao.dominio.Time;

//67 Associação Birecional
public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Real Madrid");
        Jogador jog1 = new Jogador("Haaland");
        Jogador jog2 = new Jogador("Pelé",time);
        jog1.setTime(time);
        jog2.setTime(time);
        Jogador[] jogadores = {jog1, jog2};
        time.setJogadores(jogadores);

        System.out.println("--- TIME ---");
        time.imprime();
        System.out.println("--- JOGADOR ---");
        jog1.imprime();
    }
}

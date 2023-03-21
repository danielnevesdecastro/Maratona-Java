package neves.daniel.maratonajava.javacore.Gassociacao.test;
//64 ASSOCIAÇÃO, array com objetos,

import neves.daniel.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Romário");
        Jogador j3 = new Jogador("Haaland");

        //Array com objetos
        //Jogador[] jogadores = new Jogador[3];
        //Jogador[] jogadores = new Jogador[]{j1,j2,j3};
        Jogador[] jogadores = {j1, j2, j3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}

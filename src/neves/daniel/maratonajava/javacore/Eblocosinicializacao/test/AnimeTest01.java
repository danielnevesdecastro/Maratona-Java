package neves.daniel.maratonajava.javacore.Eblocosinicializacao.test;

import neves.daniel.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

//60 - OO, blocos de inicialização
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one piece");

        //System.out.println(anime.getEpisodios());

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }

    }
}

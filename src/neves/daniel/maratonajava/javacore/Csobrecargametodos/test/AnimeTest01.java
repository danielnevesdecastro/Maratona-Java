package neves.daniel.maratonajava.javacore.Csobrecargametodos.test;

import neves.daniel.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

//57,58 - OO, Sobrecarga, construtores
public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuda Drive", "TV", 12,"Ação");
        //anime.setNome("Akuda Drive");
        //anime.setTipo("TV");
        //anime.setEpsodios(12);
        anime.imprime();

    }
}

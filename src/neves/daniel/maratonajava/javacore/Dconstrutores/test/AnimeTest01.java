package neves.daniel.maratonajava.javacore.Dconstrutores.test;


import neves.daniel.maratonajava.javacore.Dconstrutores.dominio.Anime;

//58 - OO, construtores
public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("Akuda Drive", "TV", "Ação",12);
        Anime anime2 = new Anime("YOUGI", "TV", "Ação",122,"toei");


        anime.imprime();
        anime2.imprime();

    }
}

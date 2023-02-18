package neves.daniel.maratonajava.javacore.Fmodificadorstatic.dominio;

//63 - OO, blocos de inicialização estatico
public class Anime {
    private String nome;
    private static int[] episodios ;

    static{
        System.out.println("Dentro do bloco!!");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios){
            System.out.print(episodio+" ");
        }
    }

        public String getNome () {
        return nome;
    }


        public int[] getEpisodios () {
        return episodios;
    }


    }


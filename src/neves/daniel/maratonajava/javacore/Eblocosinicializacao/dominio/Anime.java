package neves.daniel.maratonajava.javacore.Eblocosinicializacao.dominio;

//60 - OO, blocos de inicialização
public class Anime {
    private String nome;
    private int[] episodios = {1, 2, 3, 4, 5};

    {
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

    }

        public String getNome () {
        return nome;
    }


        public int[] getEpisodios () {
        return episodios;
    }


    }


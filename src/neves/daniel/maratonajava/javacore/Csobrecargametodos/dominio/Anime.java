package neves.daniel.maratonajava.javacore.Csobrecargametodos.dominio;

//57 - OO, Sobrecarga
public class Anime {

    private String nome;
    private String tipo;
    private String genero;
    private int episodios;

    //construtor default , implicito
    public Anime(){

    }
    //construtor declarado, explicito
    public Anime(String nome, String tipo, String genero, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    //sobrecarga de métodos, mesmo nome , assinaturas diferentes
    public void init(String nome, String tipo, int episodios,String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }



    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpsodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenrero() {
        return genero;
    }

    public void setGenrero(String genrero) {
        this.genero = genrero;
    }
}

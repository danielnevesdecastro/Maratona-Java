package neves.daniel.maratonajava.javacore.Dconstrutores.dominio;

//58 - OO, Construtores
public class Anime {

    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String estudio;


    public Anime(){
        System.out.println("Construtor Default");
    }
    //construtor declarado, explicito
    public Anime(String nome, String tipo, String genero, int episodios){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

    }
    //Sobrecarga de construtores
    public Anime(String nome, String tipo, String genero, int episodios, String estudio) {
        //tem que usar this() na primeira linha do construtor
        this(nome,tipo,genero,episodios);//só pode ser usar assim no construtor
        this.estudio=estudio;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(estudio);
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

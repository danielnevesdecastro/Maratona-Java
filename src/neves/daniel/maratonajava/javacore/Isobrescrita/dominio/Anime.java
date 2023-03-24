package neves.daniel.maratonajava.javacore.Isobrescrita.dominio;

//76, sobrescrita
public class Anime {
    private String nome;

    @Override//sobrescita de metodos
    public String toString() {
        return "Anime: " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

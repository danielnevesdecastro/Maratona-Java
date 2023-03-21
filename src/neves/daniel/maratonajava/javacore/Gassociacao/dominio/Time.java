package neves.daniel.maratonajava.javacore.Gassociacao.dominio;

//65 - Associação Unidirecional 1 pra N
public class Time {
    private String nome;


    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

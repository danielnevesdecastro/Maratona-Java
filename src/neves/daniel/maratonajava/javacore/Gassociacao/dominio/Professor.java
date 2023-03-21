package neves.daniel.maratonajava.javacore.Gassociacao.dominio;

//66 -Associação Unidirecional N pra 1
public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

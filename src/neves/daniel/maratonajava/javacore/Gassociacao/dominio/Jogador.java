package neves.daniel.maratonajava.javacore.Gassociacao.dominio;

//64 - Associação, Unidirecional 1 pra N
public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    //construtor da relação unidirecional
    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (this.time != null) {
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package neves.daniel.maratonajava.javacore.Jmodificadorfinal.dominio;
//78, modificador final, tipo referência (objeto)
public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

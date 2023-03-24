package neves.daniel.maratonajava.javacore.Jmodificadorfinal.dominio;

//77, modificador final
public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();// inicializando variavel, tipo pro referencia

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

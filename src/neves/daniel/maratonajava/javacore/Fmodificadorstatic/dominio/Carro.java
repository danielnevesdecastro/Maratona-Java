package neves.daniel.maratonajava.javacore.Fmodificadorstatic.dominio;

//61,62 - oo, m. static
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime() {
        System.out.println("\n-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade MAXIMA: " + this.velocidadeMaxima);
        System.out.println("Velocidade LIMITE: " + this.velocidadeLimite);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //método estático
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }
    //método estático
    public static void setVelocidadeLimite(double velocidadeLimite) {
         Carro.velocidadeLimite = velocidadeLimite;
    }
}

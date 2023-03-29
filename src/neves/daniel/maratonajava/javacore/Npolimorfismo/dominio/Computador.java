package neves.daniel.maratonajava.javacore.Npolimorfismo.dominio;

// 90 , polimorfismo
public class Computador extends Produto {
    public static final double IMPOSTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do PC");
        return this.valor * IMPOSTO;
    }

}

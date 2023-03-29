package neves.daniel.maratonajava.javacore.Npolimorfismo.dominio;

// 90 , polimorfismo
public class Tomate extends Produto {
    public static final double IMPOSTO = 0.06;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Tomate");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}

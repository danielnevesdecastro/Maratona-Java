package neves.daniel.maratonajava.javacore.Lclassesabstratas.dominio;
//84 , classes abstratas
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculoBonus();
    }

    public abstract void calculoBonus();

    @Override
    public void imprime() {
        System.out.print("Imprimindo .... ");
    }
}

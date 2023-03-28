package neves.daniel.maratonajava.javacore.Lclassesabstratas.dominio;
//84 , classes abstratas
public class Desenvolvedor extends  Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculoBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome= '" + nome + '\'' +
                ", salario= " + salario +
                '}';
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.print(" DEV\n");
    }
}

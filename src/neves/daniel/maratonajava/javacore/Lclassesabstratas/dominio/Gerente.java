package neves.daniel.maratonajava.javacore.Lclassesabstratas.dominio;
//84-86  classes abstratas
public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculoBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome= '" + nome + '\'' +
                ", salario= " + salario +
                '}';
    }
}

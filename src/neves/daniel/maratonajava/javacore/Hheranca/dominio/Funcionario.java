package neves.daniel.maratonajava.javacore.Hheranca.dominio;

//71, Herança
public class Funcionario extends Pessoa {
    private double salario;

    @Override//polimorfismo, sobrecarga
    public void imprime() {
        super.imprime();
        System.out.println("Salario " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

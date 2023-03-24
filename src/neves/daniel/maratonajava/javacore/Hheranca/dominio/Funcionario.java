package neves.daniel.maratonajava.javacore.Hheranca.dominio;

//71 - 73, Herança, super
public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);//chamando construtor da classe Pai
        this.salario = salario;
    }

    @Override//polimorfismo, sobreescrita
    public void imprime() {
        super.imprime();
        System.out.println("Salario " + this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu"+this.nome+
                " Recebi a quantia de "+this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

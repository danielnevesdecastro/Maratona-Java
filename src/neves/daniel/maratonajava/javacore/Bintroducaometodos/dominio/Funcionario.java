package neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio;

//Aula 53 - OO , Desafio métodos
public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprimirInfo() {
        System.out.println("Colaborador(a) " + this.nome + " tem " + this.idade +
                " anos, e Seus últimos 3 salários foram: ");
        if (this.salarios[0] != 0.0) {
            for (double salario : this.salarios) {
                System.out.println(salario);
            }

            //chamar método
            imprimeMediaSalario();
        } else {
            System.out.println("Nenhum Salario Informado!!");
        }
    }

    public void imprimeMediaSalario() {
        double media = 0;
        if (this.salarios[0] != 0.0) {
            for (double salario : this.salarios) {
                media += salario;
            }
            media /= this.salarios.length;
            System.out.printf("\n Sua Média Salarial é %.2f", media, " R$");
        } else {
            System.out.println("Não há valor de salário Informado para média !!!");
        }
    }
}

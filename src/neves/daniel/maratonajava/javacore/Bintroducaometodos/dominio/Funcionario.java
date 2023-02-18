package neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio;

//Aula 53 - OO , Desafio métodos
public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    private void setMedia(double media) {
        this.media = media;
    }


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

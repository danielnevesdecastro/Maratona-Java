package neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio;
//Aula 54,55 - m. acesso private, get e set
public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }



}

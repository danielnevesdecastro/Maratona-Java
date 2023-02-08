package neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio;

//Aula 49,50,51 - OO, Parametros tipo referencia, this
public class Estudante {
    //atributos
    public String nome ;
    public int idade ;
    public char sexo;

    public void imprime(){
        System.out.println("\n" + this.nome + "\n" + this.idade
                + "\n" + this.sexo);
    }
}

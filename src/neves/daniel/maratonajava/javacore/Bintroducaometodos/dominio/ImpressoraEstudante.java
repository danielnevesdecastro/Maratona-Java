package neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio;
//Aula 49 - OO, Parametros tipo referencia
public class ImpressoraEstudante {

    public void imprime(Estudante estudante){
        System.out.println("\n" + estudante.nome + "\n" + estudante.idade
                + "\n" + estudante.sexo);
       // estudante.nome = "ERROU !";
    }

}

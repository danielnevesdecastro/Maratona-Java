package neves.daniel.maratonajava.javacore.Bintroducaometodos.test;

import neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

//Aula 49,50,51 - OO, Parametros tipo referencia,This
public class EstudanteTest01 {
    public static void main(String[] args) {


        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprimeEstudante = new ImpressoraEstudante();

        estudante01.nome = "Henrry";
        estudante01.idade = 39;
        estudante01.sexo = 'M';

        estudante02.nome = "Gandalfa";
        estudante02.idade = 99;
        estudante02.sexo = 'F';

        /*
        imprimeEstudante.imprime(estudante01);
        imprimeEstudante.imprime(estudante02);
        */
        estudante01.imprime();
        estudante02.imprime();


    }
}

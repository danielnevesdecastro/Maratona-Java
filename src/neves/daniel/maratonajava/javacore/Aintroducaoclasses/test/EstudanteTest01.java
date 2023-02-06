package neves.daniel.maratonajava.javacore.Aintroducaoclasses.test;

import neves.daniel.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome="Daniel Neves";
        estudante.idade=28;
        estudante.sexo='M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);//imprime reference , endereço de memória


    }
}

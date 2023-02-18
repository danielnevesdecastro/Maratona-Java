package neves.daniel.maratonajava.javacore.Bintroducaometodos.test;

import neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

//Aula 54,55 - m. acesso private, get e set
public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome( "Jiraya");
        pessoa.setIdade(0);

        pessoa .imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}

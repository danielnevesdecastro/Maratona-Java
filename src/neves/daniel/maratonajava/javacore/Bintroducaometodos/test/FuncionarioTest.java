package neves.daniel.maratonajava.javacore.Bintroducaometodos.test;

import neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
//Aula 53 - OO , Desafio métodos
public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Daniel Neves";
        funcionario1.idade = 28;
        funcionario1.salarios =new double[] {4500.00,5000.00,5500.00};
        /*
        funcionario1.salarios[1] = 4500;
        funcionario1.salarios[2] = 5000;
        funcionario1.salarios[3] = 5500;
        */
        funcionario1.imprimirInfo();
        //funcionario1.imprimeMediaSalario(); // metodo acima chama esse metodo
       
    }
}

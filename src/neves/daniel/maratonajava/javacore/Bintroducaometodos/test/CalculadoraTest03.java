package neves.daniel.maratonajava.javacore.Bintroducaometodos.test;

import neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double divisao =calc.divideDoisNumeros(20, 2); // atribuindo metodo a variavel para imprimir
        System.out.println(divisao);

    }
}

package neves.daniel.maratonajava.javacore.Bintroducaometodos.test;

import neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

//aula 48 - oo, parametros tipo primitivo
public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int n1 = 1;
        int n2 = 2;
        calc.alteraNumeros(n1, n2);
        System.out.println(n1);
        System.out.println(n2);

    }
}

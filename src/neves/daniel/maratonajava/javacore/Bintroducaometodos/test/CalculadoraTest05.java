package neves.daniel.maratonajava.javacore.Bintroducaometodos.test;

import neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

//Aula52 - OO, Varargs
public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somarArray(numeros);
        //infinito parametros do mesmo tipo (como um array)
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8);

    }
}


package neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio;

//Aula 44,45, 46 - OO , Métodos , Parametros, retorno
public class Calculadora {

    public void somaDoisNumeros() { // sem retorno definido
        System.out.println(10 + 10);
    }

    public void subtraiDosiNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicadoisNumeros(int num1, float num2) { // parametros
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) { // retorno, pq tem um tipo definido
        if (num2 == 0) {
            return 0; // por conta do return , não precisa de else, pois o codigo para (retorna) caso seja true
        }
        return num1 / num2;

    }
}

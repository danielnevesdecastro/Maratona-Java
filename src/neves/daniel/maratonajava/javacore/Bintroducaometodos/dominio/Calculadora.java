package neves.daniel.maratonajava.javacore.Bintroducaometodos.dominio;

//Aula 44,45, 46,51 - OO , Métodos , Parametros, retorno , varargs
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
       /* Modo do Professor:
       if (num2 == 0) {
            return 0; // por conta do return , não precisa de else, pois o codigo para (retorna) caso seja true
        }
        return num1 / num2;
    */
        return (num2 == 0 ? 0 : num1 / num2); // com operador ternário
    }

    public void imprimeDivisão(double n1, double n2) {
        //System.out.println((n2 == 0 ? "Não existe divisão por 0 !!" :  n1 / n2));
        if (n2 == 0) {
            System.out.println("Não existe divisão por 0 !!!");
            return; // break dos métodos void !
        }
        System.out.println(n1 / n2);

    }

    public void alteraNumeros(int n1, int n2){
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do altera números!");
        System.out.println("N1: "+n1);
        System.out.println("N2: "+n2);

    }

    public void somarArray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println("Total: "+soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println("Total: "+soma);
    }


}

package neves.daniel.maratonajava.introducao;
// aula 15,16,17,18,19

public class Aula04Operadores {

    public static void main(String[] args) {
        // + - * /
        int n1 = 10;
        int n2 = 20;
        int soma = n1 + n2;
        int multi = n1 * n2;
        double div = n1 / (double) n2; // casting pra divisão

        System.out.println(n2 - n1); // subtração
        System.out.println(n2 + n1); // soma
        System.out.println(soma); // soma
        System.out.println(multi); // soma
        System.out.println(div); // soma

        // % resto da divisão
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == operadores lógicos
        boolean maiorOuMenor = 10 > 20;
        boolean igual = 20 == 20;
        System.out.println("\n" + maiorOuMenor);
        System.out.println(igual);

        //&& (AND) , || (OR), ! (NOT)

        int idade = 29;
        float salario = 3500F;
        boolean naLeiMaior = idade >= 30 && salario >= 4612;
        boolean naLeiMenor = idade < 30 && salario >= 3381;

        System.out.println("Está na Lei Maior que 30:" + naLeiMaior);
        System.out.println("Está na Lei Menor que 30:" + naLeiMenor);

        //OR ||
        double valorCC = 200;
        double valorCP = 5000;
        float valorPlay = 5000F;
        boolean playComprável = valorCC >= valorPlay || valorCP >= valorPlay;
        System.out.println("Esse play pode ser adquirido ? "+playComprável );


        //operadores de Atribuição
        //= += -+ *+ /+ %=
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000; foram extensa
        bonus -= 800; // bonus = bonus + 1000; foram extensa
        System.out.println("\n bonus"+ bonus);

        // incremento ++ --
        int cont = 0;
        cont++;// = cont += 1
        cont--;
        ++cont;// há diferença incremento antes ou depois
        --cont;
        System.out.println(cont);
        System.out.println(cont++);//primeiro executa depois incrementa
        System.out.println(++cont);//primeiro incrementa depois executa


    }
}

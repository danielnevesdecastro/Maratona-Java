package neves.daniel.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

//68 - Leitura de Dados no console
public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// System.in - argumento, InputStream

        //String string = scan.next();//só recebe a 1ª palavra
        System.out.println("Digite nome");
        String texto = scan.nextLine(); // pega a frase inteira

        System.out.println("Digite Idade");
        int idade = scan.nextInt();

        System.out.println("SEXO: ");
        char sexo = scan.next().charAt(0);//charAT - pegar a posição 0 de um array de caracteres

        System.out.println("----------------");
        System.out.println("Nome " + texto);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo " + sexo);

    }
}

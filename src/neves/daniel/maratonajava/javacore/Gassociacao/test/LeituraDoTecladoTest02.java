package neves.daniel.maratonajava.javacore.Gassociacao.test;

import java.util.Random;
import java.util.Scanner;

//69 - Leitura de Dados no console
public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// System.in - argumento, InputStream

        System.out.println("------PREVISÂO DO FUTURO------\n");
        System.out.println("FAÇA SUA PERGUNTA ....\n");
        String pergunta = scan.nextLine();
        System.out.println("\n\n Hmmm .... Você quer saber se ...... "+pergunta);

        Random random = new Random();
        String resposta = "SÑ";
        int randomInt = random.nextInt(resposta.length());
        char randomChar = resposta.charAt(randomInt);

        System.out.println("     "+randomChar+"....");
    }
}

package neves.daniel.maratonajava.introducao;
//aula 10,11,12,13 - tipos primitivos,casting
public class Aula02TiposPrimitivos {
    public static void main ( String[] args){
        // int , double , float , char , byte , short , long , boolean
        int age = 10;
        int age2 = (int)1000000000; // casting
        double salarioD = 2000.0D; // reconhecer como double
        float salarioF = 2500.0F; // reconhecer como float
        long numG = 1000000;
        byte idadeBy = 10;
        short idadeShor = 10;
        boolean v = true;
        boolean f = false;
        char caractere = 87 ; // traduz pra tabela ASCII
        char caractereU = '\u0041' ; // traduz pra unicode
        var nome2 = 40; // inferência, funcionalidade nova desde o java 10
        String nome = " Eclipse old ";

        System.out.println("A idade é "+age+" anos");
        System.out.println(v);
        System.out.println(f);
        System.out.println(numG+" Grandão!");
        System.out.println(caractere);
        System.out.println(caractereU);
        System.out.println(age2 + " = casting ");
        System.out.println("essa IDE " + nome); // imprimindo string


    }
}

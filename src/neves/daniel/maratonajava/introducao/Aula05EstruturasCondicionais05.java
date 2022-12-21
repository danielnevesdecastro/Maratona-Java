package neves.daniel.maratonajava.introducao;
//aula25 switch
public class Aula05EstruturasCondicionais05 {

    public static void main(String[] args){
        //imprima o dia da semana, considerando 1 como domingo
        byte dia = 9;
        //char , int , byte , short , enum e String

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break; // interromper o cógi oqunaod entrar em condição verdadeira
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!!!");
                break;

        }

        char sexo = 'm';

        
    }

}

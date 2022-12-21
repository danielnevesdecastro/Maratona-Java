package neves.daniel.maratonajava.introducao;
//Aula 26 , exercício switch
public class Aula05EstruturasCondicionais06Exercicio {
    public static void main (String[] args){
        //dado os valores de 1 a 7 , informe se é dia útil ou final de semana;
        //Considerando 1 como domingo;

        byte dia = 1;


        switch (dia){
            //tirando vantagem de não ter o brake e executar todas as condições !!!
            case 1 :
            case 7 :
                System.out.println("Fim de semana !!! ");
                break;
            case 2  :
                System.out.println("Dia útil !  ");
                break;
            case 3  :
                System.out.println("Dia útil !  ");
                break;
            case 4  :
                System.out.println("Dia útil !  ");
                break;
            case 5  :
                System.out.println("Dia útil !  ");
                break;
            case 6  :
                System.out.println("Dia útil !  ");
                break;
            default:
                System.out.println("Opção inválida!!!");
                break;



        }
    }
}

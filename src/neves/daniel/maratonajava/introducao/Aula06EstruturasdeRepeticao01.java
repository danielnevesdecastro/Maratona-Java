package neves.daniel.maratonajava.introducao;

import java.sql.SQLOutput;

//Aula 27
public class Aula06EstruturasdeRepeticao01 {
    //While, do while, for
    public static void main(String[] args) {
        //while
        int count = 0;

        while(count < 10){
            System.out.println(++count);
            //count += 1;contador imcrementando para parar
        }
        //do while
        int count1 = 12;
        do {
            System.out.println("Dentro do do-while ");
            System.out.println(count1);
            count1 --;

        }while ( count1 > 10);

        //for

        int number = 6;

        for (int i = 0 ; i <= number ; i++){
            System.out.println("Número: "+ i);
        }
        System.out.println("foi até "+ number);

        for(int j = 0 ; j <10 ; j++){
            System.out.println("\nnumero: "+j);
        }
    }
}

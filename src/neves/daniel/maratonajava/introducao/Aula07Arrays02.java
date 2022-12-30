package neves.daniel.maratonajava.introducao;

import java.sql.SQLOutput;

//Aula 33,34  iterando array
public class Aula07Arrays02 {

    public static void main(String[] args){
        // byte ,short ,int ,long, float , double 0
        //Char 'u\u0000' , em branco
        //boolean false
        //String null

        int[] idades = new int[3];
        boolean[] falso = new boolean[2];
        float[] pontoF = new float[4];
        System.out.println(idades[0]);//0
        System.out.println(falso[0]);//false
        System.out.println(pontoF[0]+"\n"); //0.0

        //Iterando arrays
        String[] herois = new String[3];
        herois[0] = "Brutto";
        herois[1] = "StarLight";
        herois[2] = "Goku";
        //length retorna o tamanho do array
        for (int i = 0; i < herois.length; i ++){
            System.out.println(herois[i]);

        }

    }
}

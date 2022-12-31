package neves.daniel.maratonajava.introducao;
//35 , Iterar array  com for each
public class Aula07Arrays03 {

    public static void main(String[] args) {

        //inicializando com valores e tamanho
        int[] numeros = {1,2,3,4,5}; //   int[] numeros = new int[]{1,2,3,4,5};

        for( int i = 0; i < numeros.length ; i++){
            System.out.println("Posição "+i+" Nº "+numeros[i]);
        }
        //nova forma de imprimir, for each
        for(int n : numeros){ // sem índice
            System.out.println("\n Nº "+n);
        }

    }
}

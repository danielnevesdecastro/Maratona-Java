package neves.daniel.maratonajava.introducao;
//Aula 38, Arrays multi , inicializações
public class Aula07Arrays05 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][0]; //definindo tamanho base, porém o segundo array está com null na memoria
        int[] array3 = {31,32,33,34,35,36};

        arrayInt[0]= new int[2];//definindo diferentes tamanho de array pra cada posição
        arrayInt[1]= new int[]{21,22,23};//Definindo valores dentro do array e tamanho automaticamente
        arrayInt[2]= array3;//atribuindo valores através de uma variável
        //Inicializando

        //percorrendo com for each
        for(int[] arrayBase:arrayInt){
            System.out.println("\n----------");
            for(int num:arrayBase){
                System.out.print(num+ " ");
            }
        }
        //Declarando array com valores, onde automaticamente o array principal e demais são dimensionados
        int[][] arrayInt2 = {{0, 0},{1, 2, 3,}, {1, 2, 3, 4, 5, 6,}};
        for(int[] arrayBase:arrayInt2){
            System.out.println("\n----------");
            for(int num:arrayBase){
                System.out.print(num+ " ");
            }
        }
    }

}

package neves.daniel.maratonajava.introducao;
//36,37 Arrays Multidimensionais, iterar com for each
public class Aula07Arrays04 {
    public static void main(String[] args) {
        //1, 2, 3, Meses
        //31, 28, 31 dias
        //Ano 2021 , 2022 ,2023 Anos
        int[][] days = new int[3][3];
        //Atribuindo valores
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 1;
        days[1][1] = 2;
        days[1][2] = 3;

        days[2][0] = 2021;
        days[2][1] = 2022;
        days[2][2] = 2023;
        //forma como eu fiz antes da solução
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days.length; j++) {
                System.out.println(days[i][j]);
            }
        }
        System.out.println("\n");
        //Iterando só um array do array
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println("\n");
        //Interando com for each
        for(int[] arrayBase:days ){ // int [] tipo array de inteiros
            for(int num:arrayBase){
                System.out.println(num);
            }
        }

    }
}
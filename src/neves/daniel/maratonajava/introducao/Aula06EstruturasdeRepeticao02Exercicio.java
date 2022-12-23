package neves.daniel.maratonajava.introducao;
//Aula 28
public class Aula06EstruturasdeRepeticao02Exercicio {
    public static void main (String[] args){

        //Exercicio for imprimir os números pares até 1000
        for(int i = 0; i <= 1000 ; i++) {
            /*primeira tentativa, muito verboso
            int div = i;
            div= i % 2;*/
            if ( i % 2 == 0) { // segunda tentativa, mais limpa
                System.out.println(i);
            }
        }
    }
}

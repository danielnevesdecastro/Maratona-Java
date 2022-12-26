package neves.daniel.maratonajava.introducao;
//Aula 29
public class Aula06EstruturasdeRepeticao03 {
    //Break
    public static void main(String[] args) {
        //imprimir os primeiros 25 numeros de um dado valor
        int numberMax = 50;

        for (int i = 0; i <= numberMax ; i++) {
            if(i > 25){
            break;
            }
            System.out.println(i);

        }
    }
}

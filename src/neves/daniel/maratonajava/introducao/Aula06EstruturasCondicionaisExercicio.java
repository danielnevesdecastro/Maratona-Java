package neves.daniel.maratonajava.introducao;
//aula 23, exercicio
public class Aula06EstruturasCondicionaisExercicio {

    public static void main (String[] args){

        double salario = 70000;
        double taxaUm = 9.70 /100;
        double taxaDois = 37.35 /100;
        double taxaTres = 49.50 /100;
        double  imposto;
        double taxa;

        if (salario <= 34712){
            imposto = taxaUm * salario;
            taxa = taxaUm * 100 ;
        }else if ( salario > 34712 && salario <= 68507 ){
            imposto = taxaDois * salario;
            taxa = taxaDois * 100;
        }else{
            imposto = taxaTres * salario;
            taxa = taxaTres * 100;
        }

        System.out.println("O imposto para seu salário de " +salario+
                "$ na Holanda, é de " +taxa+"%\nSendo assim será descontado "+ imposto+"$" );

    }

}

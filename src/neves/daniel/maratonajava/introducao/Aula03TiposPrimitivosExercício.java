package neves.daniel.maratonajava.introducao;
/*aula 14
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercício {

    public static void main (String[] args){

        String name = "Daniel";
        String endereco = "Rua Ricardo Soares de Souza Neto, 600 - Gramame";
        double salario = 2000.00D;
        String data = "16/12/2022";
        String msg = "Eu "+name+", morando no endereço: "+endereco+", confirmo que recebi o salário de "+
                salario+", na data "+data;

        System.out.println(msg);

    }
}

package neves.daniel.maratonajava.introducao;
//Aula22
public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args){
        //Operador ternário
        double salario = 3000;
        String msgDoar = "Eu vou doar 500tão ao DevDojo";
        String msgNaoDoar = "Ainda não tenho condições, mas irei ter !!!";
        String resultado = salario > 5000 ? msgDoar : msgNaoDoar;

        /*Como seria com if :
        if( salario > 5000 ) {
            resultado = msgDoar;
        }else{
            resultado = msgNaoDoar;
        }
        */
        System.out.println(resultado);

        //


    }
}

package neves.daniel.maratonajava.introducao;
//aula20
public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
    // IF
       int idade = 18;
       boolean isAutozidado = idade>=18;

        if(isAutozidado){
            System.out.println("Autorizado a tomar uma breja! ");

        }
        System.out.println("Fora do IF");

        if(isAutozidado == false) {//pode ser tbm !isAutorizado
            System.out.println("Não autorizado a comprar breja ! ");
        }else{
            System.out.println("Autorizado a Comprar Breja !!!"); // Else , senão

        }





    }
}

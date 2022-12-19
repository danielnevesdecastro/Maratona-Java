package neves.daniel.maratonajava.introducao;
//aula20
public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
    // IF
       int idade = 17;
       boolean isAutozidado = idade>=18;

        if(isAutozidado){
            System.out.println("Autorizado a tomar uma breja! ");

        }
        System.out.println("Fora do IF");

        if(isAutozidado == false) {//pode ser tbm !isAutorizado
            System.out.println("Não autorizado a comprar breja ! ");
        }

        

    }
}

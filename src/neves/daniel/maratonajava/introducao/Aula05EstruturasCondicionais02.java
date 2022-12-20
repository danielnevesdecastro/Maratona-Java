package neves.daniel.maratonajava.introducao;
//Aula21
public class Aula05EstruturasCondicionais02 {
    //if , else , else if
    public static void main(String[] args) {
        //idade < 15 Categoria Infantil
        //idade >=15 && idade < 18 categoria juvenil
        //idade >=18 categoria Adulto

        int age = 17;
        String categoria; // variável visivel ao escopo local, está fora do bloco if else

        if ( age < 15 ){
            categoria = "Categoria Infantil";
        } else if (age >= 15 && age < 18){
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
        System.out.println(categoria);

    }
}

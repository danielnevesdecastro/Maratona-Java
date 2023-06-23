package neves.daniel.maratonajava.javacore.Oexception.error;
//Exceptions - Errors
public class StackOverFlowTest01 {

    double total;

    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }

}

package neves.daniel.maratonajava.javacore.Oexception.error;
// 95 Exceptions - Errors
public class StackOverFlowTest01 {

    double total;

    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }

}

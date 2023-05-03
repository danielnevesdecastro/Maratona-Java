package neves.daniel.maratonajava.javacore.Oexception.test;
//Exceptions - Errors
public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }

}

package neves.daniel.maratonajava.javacore.Oexception.runtime;
//98 - Exceptions, Unchecked
public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));
    }

    private static int divisao(int a, int b) {
        try{
            return a / b;
        }catch ( ArithmeticException e ){
            e.printStackTrace();
        }
        return 0;

    }
}

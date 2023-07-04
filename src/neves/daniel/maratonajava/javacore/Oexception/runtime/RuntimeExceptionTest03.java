package neves.daniel.maratonajava.javacore.Oexception.runtime;
//100 , Exceptions - finally
public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();

    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo Arquivo...");
            System.out.println("Escrevendo...");
            return "Conexão Aberta ...";
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Fechando recurso SO ...");
        }
        return null;

    }
}


package neves.daniel.maratonajava.javacore.Oexception.exception;

import java.io.File;
import java.io.IOException;

//99 - exception-checked
public class ExceptionTest02 {
    public static void main(String[] args)  {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo()  {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema na criação do arquivo");
        }


    }
}



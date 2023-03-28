package neves.daniel.maratonajava.javacore.Minterfaces.test;

import neves.daniel.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import neves.daniel.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import neves.daniel.maratonajava.javacore.Minterfaces.dominio.FileLoader;

//87 , interface
public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader data1 = new DatabaseLoader();
        FileLoader file1 = new FileLoader();
        data1.load();
        file1.load();


    }
}

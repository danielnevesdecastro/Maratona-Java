package neves.daniel.maratonajava.javacore.Minterfaces.dominio;
//87 , interface
public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de um BD");
    }
}

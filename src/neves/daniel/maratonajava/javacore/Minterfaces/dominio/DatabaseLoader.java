package neves.daniel.maratonajava.javacore.Minterfaces.dominio;
//87-88 , interface
public class DatabaseLoader implements DataLoader,DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um BD");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do BD...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no BD ...");
    }
}

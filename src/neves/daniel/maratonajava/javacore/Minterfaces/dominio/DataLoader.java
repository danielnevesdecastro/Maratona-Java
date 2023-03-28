package neves.daniel.maratonajava.javacore.Minterfaces.dominio;
//87-88 , interface
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    void load();//public abstract
    default void checkPermission() {
        System.out.println("Checando permissões !!! ... ");
    }
    public static void 
}

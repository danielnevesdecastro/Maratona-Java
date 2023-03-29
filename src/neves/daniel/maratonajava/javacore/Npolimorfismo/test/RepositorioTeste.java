package neves.daniel.maratonajava.javacore.Npolimorfismo.test;

import neves.daniel.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import neves.daniel.maratonajava.javacore.Npolimorfismo.servico.RepositorioBD;
import neves.daniel.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

//95 - Polimorfismo-programação Orientada a Interface.
public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio bd = new RepositorioMemoria();//Orientação a interfaces
        bd.salvar();
    }
}

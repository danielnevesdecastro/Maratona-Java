package neves.daniel.maratonajava.javacore.Npolimorfismo.servico;


import neves.daniel.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
//95 - Polimorfismo-programação Orientada a Interface.
public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria ...");
    }
}

package neves.daniel.maratonajava.javacore.Npolimorfismo.test;

import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

//91 - Polimorfismo
public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto p1 = new Computador("Acer i5 6th", 2500); // polimorfismo
        System.out.println(p1.getNome());
        System.out.println(p1.getValor());
        System.out.println(p1.calcularImposto());
        System.out.println("\n-------------\n");

        Produto p2 = new Tomate("Americano", 20); // polimorfismop2.setDataValidade("s");
        System.out.println(p2.getNome());
        System.out.println(p2.getValor());
        System.out.println(p2.calcularImposto());
    }
}

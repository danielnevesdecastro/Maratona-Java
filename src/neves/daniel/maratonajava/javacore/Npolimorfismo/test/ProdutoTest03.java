package neves.daniel.maratonajava.javacore.Npolimorfismo.test;

import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import neves.daniel.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

//93 - Polimorfismo, cast e instanceof
public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto p1 = new Computador("Acer i5 6th", 2500); // polimorfismo

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(p1);


    }
}

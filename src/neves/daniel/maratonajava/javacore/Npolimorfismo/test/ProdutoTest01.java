package neves.daniel.maratonajava.javacore.Npolimorfismo.test;

import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import neves.daniel.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

// 90 , polimorfismo
public class ProdutoTest01 {

    public static void main(String[] args) {
        Computador pc = new Computador("Acer i5 5Th 16GB RAM",1800);
        Tomate tomate= new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(pc);
        CalculadoraImposto.calcularImpostoTomate(tomate);


    }
}

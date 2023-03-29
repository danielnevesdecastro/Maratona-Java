package neves.daniel.maratonajava.javacore.Npolimorfismo.servico;

import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

// 90,92 , polimorfismo
public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {//Polimorfismo
        System.out.println("-- Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser Pago: " + imposto);

        if (produto instanceof Tomate) {//instanceof
            Tomate tomate = (Tomate) produto;//cast
            System.out.println(tomate.getDataValidade());
           //simplificação: System.out.println(((Tomate)produto).getDataValidade());
        }

    }
}

package neves.daniel.maratonajava.javacore.Npolimorfismo.servico;

import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import neves.daniel.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

// 90 , polimorfismo
public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador pc) {
        System.out.println("-- Relatório de Imposto do PC --");
        double imposto = pc.calcularImposto();
        System.out.println("Imposto do PC: " + pc.getNome());
        System.out.println("Valor: " + pc.getValor());
        System.out.println("Imposto a ser Pago: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("-- Relatório de Imposto do Tomate --");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser Pago: " + imposto);
    }
}

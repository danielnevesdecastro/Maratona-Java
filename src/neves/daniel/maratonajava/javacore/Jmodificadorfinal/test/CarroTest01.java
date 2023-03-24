package neves.daniel.maratonajava.javacore.Jmodificadorfinal.test;

import neves.daniel.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import neves.daniel.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import neves.daniel.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

//77, modificador final
public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Suane");
        System.out.println(carro.COMPRADOR);

        Carro ferrari = new Ferrari();
        ferrari.setNome("1958 Tt");
        ferrari.imprime();// metodo final
    }
}

package neves.daniel.maratonajava.javacore.Fmodificadorstatic.test;
//61,62 - oo, m. static

import neves.daniel.maratonajava.javacore.Fmodificadorstatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedez",275);
        Carro c3 = new Carro("Audi", 290);
        //chamando método estático, direto pelo tipo a que pertence
        Carro.setVelocidadeLimite(256);
        Carro.getVelocidadeLimite();

        System.out.println(Carro.getVelocidadeLimite());

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}

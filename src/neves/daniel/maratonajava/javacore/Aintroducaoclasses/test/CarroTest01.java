package neves.daniel.maratonajava.javacore.Aintroducaoclasses.test;

import neves.daniel.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

//Aula 42,43 - OO , Coesão, referencia de objetos
public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "Toro";
        carro1.modelo = "4X4";
        carro1.ano = 2024;

        carro2.nome = "Mustang";
        carro2.modelo = "Turbo";
        carro2.ano = 2024;

        System.out.println("Carro 1:\n" + carro1.nome + "\n" + carro1.modelo + "\n" + carro1.ano);
        System.out.println("\nCarro 2:\n" + carro2.nome + "\n" + carro2.modelo + "\n" + carro2.ano);

        carro2 = carro1; // recebendo dados por referência de objeto, objetos do mesmo tipo
        System.out.println("\nCarro 2:\n" + carro2.nome + "\n" + carro2.modelo + "\n" + carro2.ano);


    }
}

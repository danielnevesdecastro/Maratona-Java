package neves.daniel.maratonajava.javacore.Lclassesabstratas.test;

import neves.daniel.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import neves.daniel.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import neves.daniel.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

//84 , classes abstratas
public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario dev1 = new Desenvolvedor("Daniel", 4500);
        Gerente ger1 = new Gerente("Nami", 12000);
        System.out.println(dev1);
        System.out.println(ger1);
        dev1.imprime();
        ger1.imprime();

    }
}

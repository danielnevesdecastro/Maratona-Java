package neves.daniel.maratonajava.javacore.Hheranca.test;

import neves.daniel.maratonajava.javacore.Hheranca.dominio.Endereco;
import neves.daniel.maratonajava.javacore.Hheranca.dominio.Funcionario;
import neves.daniel.maratonajava.javacore.Hheranca.dominio.Pessoa;
//71, Herança
public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua 0700");
        endereco1.setCep("58068370");
        Pessoa p1 = new Pessoa();
        p1.setNome("Daniel");
        p1.setCpf("5664568423");
        p1.setEndereco(endereco1);
        Funcionario f1 = new Funcionario();
        f1.setNome("Willian Suane");
        f1.setCpf("1451234564");
        f1.setEndereco(endereco1);
        f1.setSalario(20000);


        p1.imprime();
        f1.imprime();

    }
}

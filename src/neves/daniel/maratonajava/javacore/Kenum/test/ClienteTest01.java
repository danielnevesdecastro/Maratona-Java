package neves.daniel.maratonajava.javacore.Kenum.test;

import neves.daniel.maratonajava.javacore.Kenum.dominio.Cliente;
import neves.daniel.maratonajava.javacore.Kenum.dominio.TipoCliente;
import neves.daniel.maratonajava.javacore.Kenum.dominio.TipoPagamento;

//80,81 - enum
public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Daniel", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente c2 = new Cliente("Neves", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente c3 = new Cliente("William", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente c4 = new Cliente("Suane", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente[] clientes = {c1, c2, c3, c4};

        for (Cliente cliente : clientes) {

            System.out.println(cliente);

        }
        System.out.println(TipoPagamento.DEBITO.calculoDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculoDesconto(100));

    }
}

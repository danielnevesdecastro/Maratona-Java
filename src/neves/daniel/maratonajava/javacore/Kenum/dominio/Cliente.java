package neves.daniel.maratonajava.javacore.Kenum.dominio;

//80 - enum
public class Cliente {
    /*enum dentro da classe
    public enum TipoPagamento {
        DEBITO,CREDITO
    }*/

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento pagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento pagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome= '" + nome + '\'' +
                ", TipoCliente= " + tipoCliente +
                tipoCliente.getNome() +
                ", Pagamento= " + pagamento +
                '}'+"\n";
    }
}



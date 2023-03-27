package neves.daniel.maratonajava.javacore.Kenum.dominio;
//80,81 - enum
public enum TipoCliente {
    PESSOA_FISICA(1 , "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");


    //atribuindo um valor inteiro na tipagem da enumeração
    private final int valor;
    private String nome;


    TipoCliente(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}

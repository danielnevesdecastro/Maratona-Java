package neves.daniel.maratonajava.javacore.Kenum.dominio;

//80,81,83 - enum
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");


    //atribuindo um valor inteiro na tipagem da enumeração
    private final int valor;
    private String relatorio;


    TipoCliente(int valor, String nome) {
        this.valor = valor;
        this.relatorio = nome;
    }

    public static TipoCliente tipoClientePorRelatorio(String relatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getRelatorio().equalsIgnoreCase(relatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }


    public int getValor() {
        return valor;
    }

    public String getRelatorio() {
        return relatorio;
    }
}

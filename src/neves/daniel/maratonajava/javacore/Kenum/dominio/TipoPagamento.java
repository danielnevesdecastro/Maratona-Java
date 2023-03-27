package neves.daniel.maratonajava.javacore.Kenum.dominio;

//82- Enum, sobrescrita de métodos
public enum TipoPagamento {
    DEBITO {//sobrescrita de método
        @Override
        public double calculoDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calculoDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calculoDesconto(double valor) ;//abstrato , sem corpo;

}

package neves.daniel.maratonajava.introducao;
//30 Exercicio Break
public class Aula06EstruturasdeRepeticao04Exercicio {
    public static void main(String[] args) {
        /*Dado o valor de um carro, descubra em quantas vzs ele pdoe ser parcelado
         *Condição valor parcela >= 1000
         */
        double valorCarro = 30000;
        int parcela = 1;

        for (int i = parcela; i <= valorCarro; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela >= 1000) {
                System.out.println("O carro pode ser dividido em:" + i + " Parcelas de R$" + valorParcela);
            } else {
                break;
                // condição pra economizar processamento, pq for continua executando, sair do for.
            }
        }

    }
}

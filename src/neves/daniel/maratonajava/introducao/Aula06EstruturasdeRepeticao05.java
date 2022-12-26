package neves.daniel.maratonajava.introducao;
//Aula 31 , continue
public class Aula06EstruturasdeRepeticao05 {
    public static void main(String[] args) {
        /*Dado o valor de um carro, descubra em quantas vzs ele pdoe ser parcelado
         *Condição valor parcela >= 1000
         */
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >=1 ; parcela--) {
            double valorParcela = valorTotal/ parcela;
            if(valorParcela < 1000){
                continue; // pula a condição até q a parcela seja 1000
            }
            System.out.println("Parcela " + parcela + " R$ "+ valorParcela);
        }
    }


}

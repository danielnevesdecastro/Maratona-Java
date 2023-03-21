package neves.daniel.maratonajava.javacore.Gassociacao.test;

import neves.daniel.maratonajava.javacore.Gassociacao.dominio.Escola;
import neves.daniel.maratonajava.javacore.Gassociacao.dominio.Professor;

//66 -Associação Unidirecional N pra 1
public class EscolaTest01 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Jiraya Sensei");
        Professor prof2 = new Professor("JAVA Sensei");
        Professor[] professores = {prof1,prof2};
        Escola escola = new Escola("Havard",professores);// ou new Professor[]{prof1}

        escola.imprime();

    }
}

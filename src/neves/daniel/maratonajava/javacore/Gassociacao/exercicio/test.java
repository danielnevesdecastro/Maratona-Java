package neves.daniel.maratonajava.javacore.Gassociacao.exercicio;

//70, Desafio associaçã
public class test {
    public static void main(String[] args) {
        Local local = new Local("Rua OAK");
        Aluno a1 = new Aluno("Daniel", 28);
        Aluno a2 = new Aluno("William", 38);
        Aluno[] alunos = {a1,a2};
        Professor p1 = new Professor("Barba Branca", "Mestre Java ");
        Seminario s1 = new Seminario("JAVA OO", local, alunos);
        Seminario[] seminarios = {s1};

        p1.setSeminarios(seminarios);
        p1.imprime();

    }
}

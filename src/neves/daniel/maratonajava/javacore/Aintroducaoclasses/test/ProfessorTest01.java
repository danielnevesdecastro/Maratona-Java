package neves.daniel.maratonajava.javacore.Aintroducaoclasses.test;

import neves.daniel.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

//Aula 41 - OO , Coesão
public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Daniel Neves";
        professor.idade = 28;
        professor.sexo = 'M';

        System.out.println("Dados Professor:\n" + professor.nome + "\n" + professor.idade + "\n" + professor.sexo);

    }
}

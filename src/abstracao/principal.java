package abstracao;

import java.time.LocalDate;

import abstracao.dominio.Curso;
import abstracao.dominio.Mentoria;

public class principal {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descricao curso Python");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria Java");
        mentoria1.setData(LocalDate.now());

        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
    
}

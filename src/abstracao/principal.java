package abstracao;

import java.time.LocalDate;

import abstracao.desafio.dominio.Bootcamp;
import abstracao.desafio.dominio.Curso;
import abstracao.desafio.dominio.Dev;
import abstracao.desafio.dominio.Mentoria;

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
        
      /*   System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer Orange Tech+");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer OrangeTech+");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFranklyn = new Dev();
        devFranklyn.setNome("Franklyn");
        devFranklyn.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Franklyn: " + devFranklyn.getConteudosInscritos());
        devFranklyn.progredir();
        devFranklyn.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos Franklyn: " + devFranklyn.getConteudosInscritos());
        System.out.println("Conteudos concluidos Franklyn: " + devFranklyn.getConteudosConcluidos());
        System.err.println("XP: " + devFranklyn.calcularTotalXP());
        
        System.out.println("---------------------");
        
        Dev devWinston = new Dev();
        devWinston.setNome("Winston");
        devWinston.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Winston: " + devFranklyn.getConteudosInscritos());
        devWinston.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos Winston: " + devFranklyn.getConteudosInscritos());
        System.out.println("Conteudos concluidos Winston: " + devFranklyn.getConteudosConcluidos());
        System.err.println("XP: " + devWinston.calcularTotalXP());




    }
}
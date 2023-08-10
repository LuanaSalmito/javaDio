package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de aprimoramento e poo");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring framework");
        curso2.setDescricao("Para aplicações web.");
        curso2.setCargaHoraria(22);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria back-end java.");
        mentoria.setDescricao("Ajudando em uma especialização java.");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Aprendendo Java");
        bootcamp.setDescricao("Descrição bootcamp aprendendo java. ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev Luana = new Dev();
        Luana.setNome("Luana Salmito");
        Luana.inscreverBootcamp(bootcamp);

        System.out.println("--------------------------------------------------");

        System.out.println("Conteúdos inscritos:  " + Luana.getConteudosInscritos());
        Luana.progredir();
        Luana.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos:  " + Luana.getConteudosInscritos());
        System.out.println("Conteúdos concluídos:  " + Luana.getConteudosConcluidos());
        System.out.println("XP: "+Luana.calcularTotalXp());

        System.out.println("--------------------------------------------------");


        Dev Jacques = new Dev();
        Jacques.setNome("Jacques Gomes");
        Jacques.inscreverBootcamp(bootcamp);
        System.out.println("--------------------------------------------------");
        System.out.println("Conteúdos inscritos:  " + Jacques.getConteudosInscritos());
        Jacques.progredir();
        Jacques.progredir();
        Jacques.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos:  " + Jacques.getConteudosInscritos());
        System.out.println("Conteúdos concluídos:  " + Jacques.getConteudosConcluidos());
        System.out.println("XP: "+Jacques.calcularTotalXp());
        System.out.println("--------------------------------------------------");


    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

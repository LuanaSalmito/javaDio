package org.example;
import org.example.Curso.Curso;
import org.example.Mentoria.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setTitulo("Curso Java");
        curso01.setDescricao("Aprimorando poo e aprofundando em java.");
        curso01.setCargaHoraria(8);

        Curso curso02 = new Curso();
        curso02.setTitulo("Curso Spring");
        curso02.setDescricao("Spring para web.");
        curso02.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Java completo");
        mentoria.setData(LocalDate.now());

        System.out.println(curso01);
        System.out.println(curso02);
        System.out.println(mentoria);









    }
}

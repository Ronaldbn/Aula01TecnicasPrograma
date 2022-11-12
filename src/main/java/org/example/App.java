package org.example;

import org.example.Dominio.Aluno;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.setMatricula("qualquer");
        aluno.setNome("Ronald");
        aluno.setDataNascimento(LocalDate.of(2022, 02, 01));

        System.out.println(aluno.apresentar());

//        System.out.println(LocalDate.now()); // API usada para manipulação de datas.
//        System.out.println(LocalDateTime.now());
//        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Amsterdam")));

    }
}

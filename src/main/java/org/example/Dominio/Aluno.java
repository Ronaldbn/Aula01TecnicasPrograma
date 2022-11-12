package org.example.Dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;

    private List<InscricaoCurso> inscricaoCursoList; // Lista usada para representar as incrições dos alunos

    private LocalDate dataNascimento; // LocalDate é uma API do java para manipular datas e horas

    public String apresentar(){
        return String.format("Aluno: %s de matrícula %s com data nascimento %s" +
                ", %n \t Cursos %n%s", // \t é usado para dar um tab no momento da impressão. %n é para pular uma linha de código
                this.getNome(), this.getMatricula(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataNascimento), getCursos());
        //String.format é usado para não precisar ficar concatenando os valores
        //%s -> o S significa string
    }

    private String getCursos() {
        StringBuilder builder = new StringBuilder(); // String builder é usado como um construtor de strings grandes.
        builder.append("Curso \t  Data Inicio ");
        for (:
             ) {

        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

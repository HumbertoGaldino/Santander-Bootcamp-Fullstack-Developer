package aulas.oo.part03.heranca.exercicio;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Double getSalario(){
        return salario;
    }

    public Double calculaTaxa(){
        return this.salario * 0.01;
    }
}

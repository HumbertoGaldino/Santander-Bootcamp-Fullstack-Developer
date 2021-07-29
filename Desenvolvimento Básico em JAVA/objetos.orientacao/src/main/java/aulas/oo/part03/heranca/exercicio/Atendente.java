package aulas.oo.part03.heranca.exercicio;

public class Atendente extends Funcionario{

    public Atendente(String nome, Double salario) {
        super(nome, salario);
    }

    public Double calculaTaxa() {
        return this.getSalario() * 0.01;
    }
}

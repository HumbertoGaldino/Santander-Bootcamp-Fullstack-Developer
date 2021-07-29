package aulas.oo.part03.heranca.exercicio;

public class Supervisor extends Funcionario{

    public Supervisor(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double calculaTaxa() {
        return this.getSalario() * 0.05;
    }
}

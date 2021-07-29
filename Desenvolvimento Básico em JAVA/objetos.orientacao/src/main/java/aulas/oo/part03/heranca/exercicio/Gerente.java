package aulas.oo.part03.heranca.exercicio;

public class Gerente extends Funcionario {

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double calculaTaxa() {
        return this.getSalario() * 0.01;
    }
}

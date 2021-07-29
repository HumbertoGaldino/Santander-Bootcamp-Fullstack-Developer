package aulas.oo.part04;

import aulas.oo.part03.heranca.exercicio.Atendente;
import aulas.oo.part03.heranca.exercicio.Gerente;
import aulas.oo.part03.heranca.exercicio.Supervisor;

public class Exercicio {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel", 1500.00);
        Supervisor supervisor = new Supervisor("Aline", 2000.00);
        Atendente atendente = new Atendente("Lucas", 1200.00);

        System.out.println(gerente.calculaTaxa());
        System.out.println(supervisor.calculaTaxa());
        System.out.println(atendente.calculaTaxa());
    }

}

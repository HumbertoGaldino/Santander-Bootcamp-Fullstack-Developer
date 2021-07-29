package aulas.trabalhandoComDatas.Exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercicio2 {
    public static void main(String[] args) throws ParseException {
        String dataVencimento = "22/08/2021";

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimentoFormatada = formato.parse(dataVencimento);

        System.out.println(dataVencimentoFormatada);

        Calendar vencimento = Calendar.getInstance();
        vencimento.setTime(dataVencimentoFormatada);


        vencimento.add(Calendar.DATE, 10);

        if(vencimento.get(Calendar.DAY_OF_WEEK) == 6 || vencimento.get(Calendar.DAY_OF_WEEK) == 7 ){
            vencimento.add(Calendar.DATE, 1);
            System.out.println("A data de pagamento é até:" + vencimento.getTime());
        } else {
            System.out.println("A data de pagamento é até:" + vencimento.getTime());
        }

    }
}

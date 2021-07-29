package aulas.trabalhandoComDatas.Exercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio1 {

    public static void main(String[] args){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date dataAniversario = new Date();
        dataAniversario.setTime(807246000000L);

        System.out.println(formato.format(dataAniversario));

        Date data = new Date();
        data.setTime(1273892400000L);

        System.out.println(formato.format(data));

        Boolean isAfter = dataAniversario.after(data);

        System.out.println(isAfter);

    }

}

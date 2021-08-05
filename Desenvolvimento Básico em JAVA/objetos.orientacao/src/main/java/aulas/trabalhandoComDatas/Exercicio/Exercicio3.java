package aulas.trabalhandoComDatas.Exercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio3 {
    public static void main(String[] args){
        Date dataAtual = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:SSS");

        String dataAtualFormatada = formatter.format(dataAtual);

        System.out.println(dataAtualFormatada);
    }
}

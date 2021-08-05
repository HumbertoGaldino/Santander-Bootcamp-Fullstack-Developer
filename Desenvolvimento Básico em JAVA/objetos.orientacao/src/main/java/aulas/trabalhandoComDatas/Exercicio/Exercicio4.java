package aulas.trabalhandoComDatas.Exercicio;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Exercicio4 {
    public static void main(String[] args){

        LocalDateTime dataPassada = LocalDateTime.of(2010, 5, 15, 10, 00, 00);

        LocalDateTime dataAcrescentada = dataPassada.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(dataPassada);

        System.out.println(dataAcrescentada);

    }
}

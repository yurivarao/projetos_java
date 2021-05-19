package projetos_exemplo.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DataLocal {

    public static void main(String[] args) {

        // Exemplo 01
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);
        System.out.println("\n");

        // Exemplo 02
        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime depois = agora.plusHours(1);
        System.out.println(depois);
        System.out.println("\n");

        // Exemplo 03
        LocalDateTime data_hora = LocalDateTime.now();
        System.out.println(data_hora);

        LocalDateTime data_hora_futuro = data_hora.plusHours(1).plusDays(2).plusSeconds(12);
        System.out.println(data_hora_futuro);
        System.out.println("\n");

        // Exercicio
        LocalDateTime data_hora1 = LocalDateTime.of(2010, 5, 15, 10, 0, 0);
        System.out.println(data_hora1);

        LocalDateTime data_hora_futuro1 = data_hora1.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(data_hora_futuro1);
        System.out.println("\n");

    }
}
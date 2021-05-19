package projetos_exemplo.Data;

import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {

        // Exemplo 01
        Calendar agora = Calendar.getInstance();
        System.out.println(agora);
        System.out.println("\n");

        // Exemplo 02
        System.out.println("A data atual e: " + agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atras: " + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        System.out.println("\n");

        // Exemplo 03
        System.out.printf("%tc\n", agora);
        System.out.printf("%tF\n", agora);
        System.out.printf("%tD\n", agora);
        System.out.printf("%tr\n", agora);
        System.out.printf("%tT\n", agora);

    }
}


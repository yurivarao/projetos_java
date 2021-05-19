package projetos_exemplo.Data;

import java.util.Date;
import java.time.Instant;

public class Data {
    public static void main(String[] args) {

        // Exemplo 01
        Date nova_data = new Date();
        System.out.println(nova_data);

        // Exemplo 02
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        Date data_long = new Date(currentTimeMillis);
        System.out.println(data_long);

        // Exemplo 03 e 04
        Date data_passado = new Date(1513124807691L);
        Date data_futuro1 = new Date(1613124807691L);
        Date data_futuro2 = new Date(1613124807691L);

        boolean is_after = data_passado.after(data_futuro1);
        System.out.println(is_after);

        boolean is_before = data_passado.before(data_futuro1);
        System.out.println(is_before);

        boolean is_equals = data_futuro1.equals(data_futuro2);
        System.out.println(is_equals);

        int compare1 = data_passado.compareTo(data_futuro1);
        System.out.println(compare1);
        int compare2 = data_futuro1.compareTo(data_passado);
        System.out.println(compare2);
        int compare3 = data_futuro1.compareTo(data_futuro2);
        System.out.println(compare3);

        // Exemplo 05
        //Instant instant = new nova_data.toInstant();
        //System.out.println(instant);

        // Exercício
        Date data_nascimento = new Date(863060400000L);
        Date data_comparar = new Date(1273935600000L);

        boolean is_after1 = data_nascimento.after(data_comparar);
        System.out.println(is_after1);
        boolean is_before1 = data_nascimento.before(data_comparar);
        System.out.println(is_before1);

    }
}

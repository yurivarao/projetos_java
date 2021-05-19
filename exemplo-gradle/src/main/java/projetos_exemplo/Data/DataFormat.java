package projetos_exemplo.Data;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DataFormat {

    public static void main(String[] args) {

        // Exemplo 01
        Date agora = new Date();

        String data_to_str = DateFormat.getInstance().format(agora);
        System.out.println(data_to_str);

        data_to_str = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(data_to_str);

        data_to_str = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(data_to_str);
        System.out.println("\n");

        // Exemplo 02
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String data_formatada = formatter.format(agora);
        System.out.println(data_formatada);

        // Exercicio
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:S");
        String data_formatada1 = formatacao.format(agora);
        System.out.println(data_formatada1);
    }
}

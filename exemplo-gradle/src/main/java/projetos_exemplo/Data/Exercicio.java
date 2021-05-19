package projetos_exemplo.Data;

import java.util.Date;
import java.util.Calendar;

public class Exercicio {

    public static void main(String[] args) {

        Calendar data_atual = Calendar.getInstance();

        data_atual.add(Calendar.DATE, 10);

        int dia_semana = data_atual.get(Calendar.DAY_OF_WEEK);

        if (dia_semana == 7) {
            data_atual.add(Calendar.DATE, 2);
            System.out.printf("Data para pagamento sera: %tF\n", data_atual.getTime());
            System.out.println("Daqui a 12 dias");
        } else if (dia_semana == 1) {
            data_atual.add(Calendar.DATE, 1);
            System.out.printf("Data para pagamento sera: %tF\n", data_atual.getTime());
            System.out.println("Daqui a 11 dias");
        } else
            System.out.printf("Data para pagamento sera: %tF\n", data_atual.getTime());
            System.out.println("Daqui a 10 dias");
    }

}

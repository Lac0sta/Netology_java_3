public class Main {
    public static void main(String[] args) {

        int initial_state = 100; /* начальное состояние счета клиента */
        int refill = 4000; /* сумма пополнения счета */
        int bonus = 100; /* количество бонусов, начисляемых за каждые 100 рублей пополнения */
        int final_state; /* состояние счета клиента после пополнения */
        int final_bonus; /* количество начисленных бонусов при пополнении счёта более, чем на 1000 рублей */


        if (refill > 1000) {
            final_bonus = (refill / bonus);
            final_state = (initial_state + refill + final_bonus);
            System.out.println("Сумма на счёте после пополнения (руб.):");
            System.out.println(final_state);
            System.out.println("Количество начисленных бонусов (руб.):");
            System.out.println(final_bonus);

        } else {
            final_state = (initial_state + refill);
            System.out.println("Сумма на счёте после пополнения (руб.):");
            System.out.println(final_state);
            System.out.println("Бонусов не начислено");
        }

    }
}

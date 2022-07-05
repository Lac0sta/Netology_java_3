public class Main {
    public static void main(String[] args) {

        int initialState = 100; /* начальное состояние счета клиента */
        int refill = 4000; /* сумма пополнения счета */
        int bonus = 100; /* количество бонусов, начисляемых за каждые 100 рублей пополнения */
        int finalState; /* состояние счета клиента после пополнения */
        int finalBonus; /* количество начисленных бонусов при пополнении счёта более, чем на 1000 рублей */


        if (refill > 1000) {
            finalBonus = (refill / bonus);
            finalState = (initialState + refill + finalBonus);
            System.out.println("Сумма на счёте после пополнения (руб.):");
            System.out.println(finalState);
            System.out.println("Количество начисленных бонусов (руб.):");
            System.out.println(finalBonus);

        } else {
            finalState = (initialState + refill);
            System.out.println("Сумма на счёте после пополнения (руб.):");
            System.out.println(finalState);
            System.out.println("Бонусов не начислено");
        }

    }
}

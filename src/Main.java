public class Main {
    public static void main(String[] args) {
        int amount = 4_500; // стоимость билета
        int miles_costs = 20; // стоимость одной бонусной мили
        int bonus = amount / miles_costs; //колличество полученных бонусов

        System.out.println("Итоговый бонус: " + bonus);

    }
}

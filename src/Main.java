import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int amount = 4_500; // стоимость билета
      int x = 20; // стоимость одной бонусной мили
        int bonus = amount / x; //колличество полученных бонусов

        System.out.println("Итоговый бонус: " + bonus );

    }
}

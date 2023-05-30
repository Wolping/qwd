import java.util.Scanner;

public class Fight {

    // Реализовать бой между персонажем и врагом

    public static void battle(Character character, Enemy enemy) {
        System.out.println("Вы вступили в бой с врагом уровня " + enemy.getLevel() + "!");

        System.out.println("Ваше здоровье: " + character.getHealth());
        System.out.println("Здоровье врага: " + enemy.getHealth());

        while (!character.isDefeated() && !enemy.isDefeated()) {
            // Ход персонажа
            System.out.println("Выберите действие:");
            System.out.println("1. Атака");
            System.out.println("2. Защита");
            int action = new Scanner(System.in).nextInt();

            switch (action) {
                case 1:
                    character.attack(enemy);
                    break;
                case 2:
                    character.defend();
                    System.out.println("Вы защитились!");
                    break;
                default:
                    System.out.println("Некорректное действие. Бой продолжается...");
            }

            // Ход врага
            if (!enemy.isDefeated()) {
                enemy.attack(character);
            }

            // Вывести текущее состояние здоровья персонажа и врага
            System.out.println("Ваше здоровье: " + character.getHealth());
            System.out.println("Здоровье врага: " + enemy.getHealth());
        }
    }
}

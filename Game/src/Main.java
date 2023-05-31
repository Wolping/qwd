import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Создать новый персонаж и показать его информацию
        Character character = Register.createCharacter();
        character.displayStats();


        // Действия в игре
        Scanner scanner = new Scanner(System.in);
        while (true) {
                System.out.println("*******************");
                System.out.println("Выберите действие:");
                System.out.println("1. Перейти в новую локацию");
                System.out.println("2. Просмотреть характеристики героя");
                System.out.println("3. Выйти из игры");
                System.out.println("*******************");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Enemy enemy = Enemy.createEnemy();
                        Fight.battle(character, enemy);
                        if (character.isDefeated()) {
                            System.out.println("*******************");
                            System.out.println(" ");
                            System.out.println("Вы были повержены в бою. Конец игры!");
                            System.out.println(" ");
                            return;
                        } else {
                            System.out.println("*******************");
                            System.out.println(" ");
                            System.out.println("Вы победили врага!");
                            System.out.println(" ");
                            System.out.println("*******************");
                            character.levelUp();
                        }
                        break;
                    case 2:
                        character.displayStats();
                        break;
                    case 3:
                        System.out.println("До свидания!");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте еще раз.");
                        break;
                }
            }
    }
}









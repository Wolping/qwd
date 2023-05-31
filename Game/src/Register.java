import java.util.Scanner;

public class Register {

    // Создать нового персонажа на основе выбранного класса
    public static Character createCharacter() {
        Character character = null;
        Scanner scan = new Scanner(System.in);

        // запросить имя персонажа
        System.out.println("*******************");
        System.out.println("Введите имя персонажа:");
        System.out.println("*******************");
        String name = scan.next();

        // Показать меню классов персонажей и выбрать класс
        System.out.println("*******************");
        System.out.println("Выберите ваш класс:");
        System.out.println("1. Воин");
        System.out.println("2. Маг");
        System.out.println("3. Разбойник");
        System.out.println("*******************");
        int classType = scan.nextInt();
        switch (classType) {
            case 1:
                character = new Warrior(name);
                break;
            case 2:
                character = new Mage(name);
                break;
            case 3:
                character = new Rogue(name);
                break;
            default:
                System.out.println("Такой класс не существует. Выберите снова.");
                createCharacter();
        }

        return character;
    }
}

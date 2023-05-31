public class Rogue extends Character {

    public Rogue(String name) {
        super(name, 1, 25, 17, 3);
    }

    @Override
    public void attack(Enemy enemy) {
        int damage = strength + (int)(Math.random() * 3);
        System.out.println("Вы нанесли врагу удар и нанесли " + damage + " урона!");
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        int amount = (int)(Math.random() * 10) + 9;
        System.out.println("Вы уклонились от атаки и восстановили " + amount + " здоровья.");
        heal(amount);
    }
}
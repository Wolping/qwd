public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 1, 30, 21, 4);
    }

    @Override
    public void attack(Enemy enemy) {
        int damage = strength + (int)(Math.random() * 5);
        System.out.println("Вы атаковали врага и нанесли " + damage + " урона!");
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        int amount = (int)(Math.random() * 10) + 9;
        System.out.println("Вы защищаетесь и восстанавливаете " + amount + " здоровья.");
        heal(amount);
    }
}
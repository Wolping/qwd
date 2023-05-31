public class Mage extends Character {

    public Mage(String name) {
        super(name, 1, 20, 25, 2);
    }

    @Override
    public void attack(Enemy enemy) {
        int damage = (int)(Math.random() * 10) + strength;
        System.out.println("Вы использовали магию и нанесли " + damage + " урона!");
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        int amount = (int)(Math.random() * 10) + 9;
        System.out.println("Вы защищаетесь и восстанавливаете " + amount + " здоровья.");
        heal(amount);
    }
}
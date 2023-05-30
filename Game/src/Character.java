public abstract class Character {
    protected String name;
    protected int level;
    protected int maxHealth;
    protected int currentHealth;
    protected int strength;
    protected int defense;

    public Character(String name, int level, int maxHealth, int strength, int defense) {
        this.name = name;
        this.level = level;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.defense = defense;
        this.currentHealth = maxHealth;
    }

    public void takeDamage(int damage) {
        int actualDamage = damage - defense;
        if (actualDamage < 0) {
            actualDamage = 0;
        }
        currentHealth -= actualDamage;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void heal(int amount) {
        currentHealth += amount;
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }

    public void levelUp() {
        level++;
        maxHealth += 10;
        currentHealth += 10;
        strength += 2;
        System.out.println("Вы достигли нового уровня! У вас увеличились характеристики:");
        displayStats();
    }

    public boolean isDefeated() {
        return currentHealth <= 0;
    }

    public void displayStats() {
        System.out.println("*******************");
        System.out.println("Ваш персонаж:");
        System.out.println("Имя персонажа: " + name);
        System.out.println("Уровень: " + level);
        System.out.println("Здоровье: " + currentHealth + "/" + maxHealth);
        System.out.println("Сила: " + strength);
        System.out.println("Защита: " + defense);
    }

    public abstract void attack(Enemy enemy);

    public abstract void defend();

    public int getHealth() {
        return currentHealth;
    }
}
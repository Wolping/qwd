public class Enemy { private int level; private int maxHealth; private int currentHealth; private int strength; private int defense;

    public Enemy(int level, int strength, int defense, int health) {
        this.level = level;
        this.strength = strength;
        this.defense = defense;
        this.maxHealth = health;
        this.currentHealth = health;
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

    public void attack(Character character) {
        int damage = strength + (int)(Math.random() * 5);
        System.out.println("Враг атакует и наносит " + damage + " урона!");
        character.takeDamage(damage);
    }

    public boolean isDefeated() {
        return currentHealth <= 0;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return currentHealth;
    }

    // Создать нового врага со случайными характеристиками
    public static Enemy createEnemy() {
        int level = (int)(Math.random() * 3) + 1; // случайный уровень от 1 до 3
        int strength = (int)(Math.random() * 10) + (level * 2); // случайная сила, зависящая от уровня врага
        int defense = (int)(Math.random() * 10) + (level * 2); // случайная защита, зависящая от уровня врага
        int health = (int)(Math.random() * 50) + (level * 10); // случайное количество здоровья, зависящее от уровня врага

        return new Enemy(level, strength, defense, health);
    }
}




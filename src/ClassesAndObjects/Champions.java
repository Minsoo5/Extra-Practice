package ClassesAndObjects;

public class Champions implements Mid {
    String name = "Dummy";
    String weapon = "Sword";
    String shout = "Yah";
    int health = 100;
    int attack = 50;

    public Champions() {}

    public Champions(int health, int attack) {}

    public Champions(String name, String weapon, int health, int attack) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.attack = attack;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shout() {
        System.out.println(shout);
    }
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}




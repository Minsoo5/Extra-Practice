package DesignPatterns.Factory;

public abstract class EnemyShip {

    private String name;
    private double health;
    private double dmg;

    public EnemyShip(String name, double health, double dmg) {
        this.name = name;
        this.health = health;
        this.dmg = dmg;
    }

    public void spawnShip() {
        System.out.println(name + " Has Appeared!");
        System.out.println("It Has " + health + " HP!");
    }

    public void attack() {
        System.out.println(name + " Fires And Does " + dmg + " Damage!");
    }

    public void flee() {
        System.out.println("The Enemy Ran Away!");
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getDmg() {
        return dmg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }
}

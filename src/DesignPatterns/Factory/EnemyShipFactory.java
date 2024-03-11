package DesignPatterns.Factory;

public class EnemyShipFactory {

    public EnemyShipFactory() {}

    public EnemyShip produceEnemyShip(String shipChoice) {
        return switch (shipChoice) {
            case "B" -> new Blimp("Fat Blimp", 200.0, 30.0);
            case "J" -> new Jet("Fighter Jet", 100.0, 50);
            case "U" -> new UFO("Alien UFO", 500.0, 100);
            default -> null;
        };
    }

}

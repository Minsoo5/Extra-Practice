package DesignPatterns.Factory;

import java.util.Scanner;

public class FactoryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnemyShipFactory factory = new EnemyShipFactory();

        System.out.println("Please Choose an Enemy Type");
        System.out.println("B / J / U");

        String userChoice = scanner.nextLine();

        EnemyShip theEnemy = factory.produceEnemyShip(userChoice);

        theEnemy.spawnShip();
        theEnemy.attack();
        System.out.println("You Used Full Counter!");
        theEnemy.flee();

        System.out.println("NICE!");

    }
}

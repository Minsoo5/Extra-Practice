import Hola.Printer;
import Lambdas.PrintGreetings;
import Lambdas.PrintMessage;
import LeetCode.LevelEasy;
import VarArgTests.PeopleList;
import VarArgTests.Person;
import WhiteBoard.ArrayManipulation;
import WhiteBoard.NumberManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {


        // Given an array of int
        //Pass in int index and int value
        //add the value into the index position
        //and return an array

        //123456 index 3 value 9
        //result = 1239456

//        for (int i = 100; i >= 0 ; i-=5) {
//            System.out.println(Math.PI);
//        }

//        String name = "Min";
//        String holiday = "Christams";
//
//
//        PrintGreetings doorGreet = (n, h) -> {
//            System.out.println("Hello and welcome to Target " + n);
//        };
//
//
//        PrintGreetings sayHi = (n, h) -> {
//            System.out.println("Hello there " + n + "!");
//            System.out.println("It is so nice to see you!");
//            System.out.println("Have a great " + h + "!");
//        };
//
//        sayHi.printGreetings(name, holiday);
//
//        System.out.println("\n---------------\n");
//
//        doorGreet.printGreetings(name, holiday);
//
//        System.out.println("\n---------------\n");


//        double[] originalArray = {1.3, 5.4, 6.1, 1.0, 9.2};
//
//        double[] newArray = ArrayManipulation.wtf(originalArray);
//
//        for (double d : newArray) {
//            System.out.println(d);
//        }

//        int[] test = {1, 3, 5, 7};

//        System.out.println(ArrayManipulation.onlyContainsOdd(test));
//
//        System.out.println(" -------------------- ");
//
//        Calculate cal = new Calculate();
//        long ans = cal.factorial(5);
//
//        System.out.println(ans);
//
//        System.out.println(NumberManipulation.factorial(5));
//
//        System.out.println(NumberManipulation.factorialOneLine(5));

//        int[] descending = {1, 5, 3, 7, 2, 6, 4, 8, 0, 9};
//
//        descending = ArrayManipulation.sortOrderDesc(descending);
//
//        for (int i : descending) {
//            System.out.print(i + " ");
//        }
//        System.out.println(" ----------------- ");
//
//        System.out.println(100 + 100 + "Hola");
//        System.out.println("Hola" + 100 + 100);


//        Person rickie = new Person(1l, "Rick");
//        Person santos = new Person(2l, "Santos");
//        Person adams = new Person(3l, "Adams");
//        Person maggie = new Person(4l, "Maggie");
//        Person min = new Person(5l, "Min");
//
//        PeopleList<Person> peeps = new PeopleList<>(rickie, santos, adams, maggie, min);
//
//
//        //peeps = (PeopleList<Person>) peeps;
//
//        System.out.println(peeps.size());

//        int[] flowerbed = {1,0,0,0,1};
//        int n = 1;
//        System.out.println(LevelEasy.canPlaceFlowers(flowerbed, n));
//
//        String a = "twn";
//        String b = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxxxxxxn";
//
//        System.out.println(LevelEasy.isSubsequence(a, b));
//    }

        int[] nums = {2,5};
        int target = 5;

        System.out.println(LevelEasy.search(nums, target));

    }

    }







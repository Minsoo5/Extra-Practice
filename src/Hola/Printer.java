package Hola;

import java.util.ArrayList;

public class Printer <T> {

    T thingToPrint;
    ArrayList<T> arrayList;

    public Printer(){}

    public Printer (T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public Printer (ArrayList<T> arrayList) {
        this.arrayList = new ArrayList<>(arrayList);
    }

    public void print() {
        System.out.println(thingToPrint);
    }

}

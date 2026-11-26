package org.lessons.java.oop.animals1;

public class Passerotto extends AbstractAnimale {

    @Override
    public void verso() {
        System.out.println("Il passerotto cinguetta!");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia bacche!");
    }

}

package org.lessons.java.oop.animals1;

public class Aquila extends AbstractAnimale {

    @Override
    public void verso() {
        System.out.println("L'aquila strida!");
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia le lucertole!");
    }

}

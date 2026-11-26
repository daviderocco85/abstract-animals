package org.lessons.java.oop.animals1;

public class Cane extends AbstractAnimale {

    @Override
    public void verso() {
        System.out.println("Il cane abbaia!");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia le crocchette!");
    }

}

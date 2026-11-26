package org.lessons.java.oop.animals1;

public class Delfino extends AbstractAnimale {

    @Override
    public void verso() {
        System.out.println("Il delfino schiocca!");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia gamberetti!");
    }

}

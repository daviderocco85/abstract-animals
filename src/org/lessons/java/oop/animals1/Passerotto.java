package org.lessons.java.oop.animals1;

import org.lessons.java.interfaces.IVolante;

public class Passerotto extends AbstractAnimale implements IVolante {

    @Override
    public void verso() {
        System.out.println("Il passerotto cinguetta!");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia bacche!");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

}

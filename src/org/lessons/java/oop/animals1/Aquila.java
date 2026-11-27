package org.lessons.java.oop.animals1;

import org.lessons.java.interfaces.IVolante;

public class Aquila extends AbstractAnimale implements IVolante {

    @Override
    public void verso() {
        System.out.println("L'aquila strida!");
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia le lucertole!");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

}

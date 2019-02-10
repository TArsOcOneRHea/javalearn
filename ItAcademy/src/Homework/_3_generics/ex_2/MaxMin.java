package Homework._3_generics.ex_2;

import Homework._3_generics.ex_1.Pair;

public class MaxMin<E extends Comparable<E>> extends Pair {
    public MaxMin(E firstElement, E secondElement) {
        super(firstElement, secondElement);
    }

//    public E min(){
//
//        if (getFirstElement().compareTo(getSecondElement()) > 0)
//            return (E) getSecondElement();
//        else
//            return (E) getFirstElement();
//    }

//    public E max(){
//
//        if (getFirstElement().compareTo(getSecondElement()) <= 0)
//            return (E) getSecondElement();
//        else
//            return (E) getFirstElement();
//    }
}

package Homework._3_generics.ex_1;

public class Pair<E> {
    private E firstElement;
    private E secondElement;

    public Pair(E firstElement, E secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public E getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(E firstElement) {
        this.firstElement = firstElement;
    }

    public E getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(E secondElement) {
        this.secondElement = secondElement;
    }
}

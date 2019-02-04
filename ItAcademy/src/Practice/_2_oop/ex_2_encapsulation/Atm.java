package Practice._2_oop.ex_2_encapsulation;

public class Atm {
    private int note10;
    private int note20;
    private int note50;

    public Atm(int note10, int note20, int note50) {
        this.note10 = note10;
        this.note20 = note20;
        this.note50 = note50;
    }

    public int getNote10() {
        return note10;
    }

    public void setNote10(int note10) {
        this.note10 = note10;
    }

    public int getNote20() {
        return note20;
    }

    public void setNote20(int note20) {
        this.note20 = note20;
    }

    public int getNote50() {
        return note50;
    }

    public void setNote50(int note50) {
        this.note50 = note50;
    }
}

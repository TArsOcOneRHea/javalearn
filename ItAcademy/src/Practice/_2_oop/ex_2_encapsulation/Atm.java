package Practice._2_oop.ex_2_encapsulation;

public class Atm {
    private int note10;
    private int note20;
    private int note50;

    public final static String NOTE50 = "note50";
    public final static String NOTE20 = "note20";
    public final static String NOTE10 = "note10";

    public final static int tensAmount  = 20;
    public final static int twentiesAmount = 20;
    public final static int fiftiesAmount  = 20;

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

    public void addMoney(String type, int amount) {
        if (getNote20() + amount < twentiesAmount || getNote50() + amount < fiftiesAmount || getNote10() + amount < tensAmount) {
            switch (type) {
                case (NOTE10):
                note10 = getNote10() + amount;
                break;
                case (NOTE20):
                note20 = getNote20() + amount;
                break;
                case (NOTE50):
                    note50 = getNote50() + amount;
                    break;
            }
        } else {
            System.out.println("Невозможно добавить купюру");
        }
    }

    public String toString() {
        return "ATM содержит " +
                "note10 = " + note10 +
                ", note20 = " + note20 +
                ", note50 = " + note50 +
                '.';
    }

    public boolean getMoney(int sum) {
        int getSum = getNote10() * 10 + getNote20() * 20 + getNote50() * 50;
        if (getSum < sum) {
            return false;
        } else {
            if (sum % 10 != 0) {
                System.out.println("Выберите другую сумму, купры только 10, 20, 50");
                return false;
            } else {
                int amountfift = sum / 50;
                int amounttwent = (sum - amountfift * 50) / 20;
                int amountten = (sum - amountfift * 50 - amounttwent * 20) / 10;
                System.out.println("Кол-во 50:  " + amountfift + "  Кол-во 20:  " + amounttwent + "  Кол-во 10: " + amountten);
            }
            return true;
        }
    }
}


package Practice._2_oop.ex_2_encapsulation;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(10, 10, 10);
        System.out.println(atm.toString());
        atm.addMoney(Atm.NOTE50,2);
        System.out.println(atm.toString());

        System.out.println(atm.getMoney(690));
        System.out.println(atm.toString());

    }
}

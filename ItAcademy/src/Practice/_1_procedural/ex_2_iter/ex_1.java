package Practice._1_procedural.ex_2_iter;
/*
В 1626 году индейцы продали Манхэттен за 24$.
Написать программу, которая высчитывает сумму, получившуюся бы в текущем году, если бы индейцы положили
эти деньги в банк под 5% годовых.
 */
public class ex_1 {
    public static void main(String[] args) {
        double money = 24d;
        double rent = 0.05d;
        int firstYear = 1626;
        int curentYear = 2019;
        int period = curentYear - firstYear;

        for (int i = 0; i < period; ++i){
            money = money + money * rent;
            System.out.println(i + 1 + " year - " + Math.round(money));
        }
    }
}

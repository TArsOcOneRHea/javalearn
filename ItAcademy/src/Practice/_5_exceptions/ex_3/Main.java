package Practice._5_exceptions.ex_3;

/**
 * Создать собственный класс-исключение - наследник класса Exception. Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в консоль.
 */
public class Main {
    public static void main(String[] args) {
      try {
          throw new RuntimeException();
      } catch (Exception e){
          throw new MyException(e);
      }
    }
}

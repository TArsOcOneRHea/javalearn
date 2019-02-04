package Homework._2_oop.hw_2_encapsulation;

/*
Продолжение задачи 1. Используя класс точки, создать класс Rectangle, описывающий прямоугольник,
и класс Circle описывающий круг. В них должны храниться поля типа Point в роли координат.
Создать следующие методы в классе Rectangle:
- Высчитывающий длину диагонали
Методы в классе Circle:
- Высчитывающий длину окружности. У обоих классов должен быть метод нахождения площади. Написать программу,
тестовый класс с методом main, демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
 */

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        System.out.println("Distance is - " + point1.distance());
        Point point2 = new Point(5,6).translate(2, 4).scale(6);
        System.out.println("Distance is - " + point2.distance());

        Circle circle = new Circle(1, 2, 10);
        System.out.println(circle.length());
        System.out.println(circle.square());

        Rectangle rectangle = new Rectangle(1, 2);
        System.out.println("Distance is - " + rectangle.distance());
        System.out.println(rectangle.square());
    }
}

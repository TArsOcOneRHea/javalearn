import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] marks = new int[10];
        marksOfStudent(marks);
        printMarksOfStudent(marks);
        averageMark(marks);
        maxMarkOfStudent(marks);
        laggingStudents(marks);
        arraySorting(marks);
    }

    private static void printMarksOfStudent(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Ученик № " + i + " = " + marks[i] + ";");
        }
    }

    private static void marksOfStudent(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
    }

    private static void averageMark(int[] marks) {
        double summ = 0;
        for (int mark : marks) {
            summ = summ + mark;
        }
        System.out.println("Средняя оценка - " + summ / marks.length + " баллов.");
    }
    private static  void maxMarkOfStudent(int[] marks){
        int maxMark = 0;
        for (int mark : marks)
            if (maxMark < mark) {
                maxMark = mark;
            }
        System.out.println("Максимальная оценка - " + maxMark + " баллов.");
    }
    private static void laggingStudents(int[] marks){
        int summ = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <= 3){
                summ = summ + 1;
            }
        }
        for (int z = 0; z < marks.length; z++) {
            if (marks[z] <= 3){
                System.out.println("Номер отстающего ученика - " + z + ".");
            }
        }
        System.out.println("Количество отстающих учеников - " + summ + ".");
    }
    private static void arraySorting(int [] marks){
        for (int i = 0; i < marks.length; i++) {
            int max_idx = i;
            for (int index = i; index < marks.length; index++) {
                if (marks[max_idx] < marks[index]) {
                    max_idx = index;
                }
            }
            int tmp = marks[i];
            marks[i] = marks[max_idx];
            marks[max_idx] = tmp;
        }
        System.out.println("Отсортированный массив оценок - " + Arrays.toString(marks));
    }
}
